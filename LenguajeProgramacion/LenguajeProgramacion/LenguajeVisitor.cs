using System;
using System.Collections.Generic;
using Antlr4.Runtime.Misc;
using LenguajeProgramacion.Content;


namespace LenguajeProgramacion
{
    public class LenguajeVisitor: LenguajeBaseVisitor<object?> 
    {
        private Dictionary<string, object?> Variables { get; } = new();

        public LenguajeVisitor()
        {
            Variables["PI"] = Math.PI;
            Variables["E"] = Math.E;
            Variables["ESCRIBIR"] = new Func<object?[], object?>(Write);
        }

        public override object? VisitFunctionCall(LenguajeParser.FunctionCallContext context)
        {
            var name = context.IDENTIFIER().GetText();

            var args = context.expression().Select(Visit).ToArray();

            if (!Variables.ContainsKey(name))
            {
                throw new Exception($"La funcion {name} no esta definida");
            }

            if ((Variables[name] is not Func<object?[], object?> func))
                throw new Exception($"Variable {name} no definida");

            return func(args);
        }


        public override object? VisitAssignment(LenguajeParser.AssignmentContext context)
        {
            var varName = context.IDENTIFIER().GetText();

            var value = Visit(context.expression());

            Variables[varName] = value;

            return null;
        }

        public override object? VisitIdentificadores(LenguajeParser.IdentificadoresContext context)
        {
            var varName = context.IDENTIFIER().GetText();

            if (!Variables.ContainsKey(varName))
            {
                throw new Exception($"Variable {varName} no definida");
            }

            return Variables[varName];
        }

        public override object? VisitSumaResta(LenguajeParser.SumaRestaContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));
            var op = context.addOp().GetText();

            return op switch
            {
                "+" => Add(left, right),
                "-" => Substract(left, right),
                _ => throw new NotImplementedException()
            };
        }

        public override object? VisitMulDiv(LenguajeParser.MulDivContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));
            var op = context.multOp().GetText();

            return op switch
            {
                "*" => Multiply(left, right),
                "/" => Divide(left, right),
                _ => throw new NotImplementedException()
            };
        }

        public override object? VisitPotencia(LenguajeParser.PotenciaContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));
            var op = context.powOp().GetText();

            return op switch
            {
                "^" => Power(left, right),
                _ => throw new NotImplementedException()
            };
        }

        public override object? VisitRaiz(LenguajeParser.RaizContext context)
        {
            var left = Visit(context.expression(0));
            var op = context.sqrtOp().GetText();

            return op switch
            {
                "raiz" => Sqrt(left),
                _ => throw new NotImplementedException()
            };
        }

        public override object? VisitConstant(LenguajeParser.ConstantContext context)
        {
            if (context.INTEGER() is { } i)
                return int.Parse(i.GetText());

            if (context.FLOAT() is { } f)
                return float.Parse(f.GetText());

            if (context.DOUBLE() is { } d)
                return double.Parse(d.GetText());

            if (context.STRING() is { } s)
                return s.GetText()[1..^1];

            if (context.BOOL() is { } b)
                return b.GetText() == "true";

            if (context.NULL() is { } )
                return null;

            throw new NotImplementedException();
        }

        public override object? VisitWhileBlock(LenguajeParser.WhileBlockContext context)
        {
            Func<object?, bool> condition = context.WHILE().GetText() == "while"
                ? IsTrue
                : IsFalse
            ;

            if (condition(Visit(context.expression())))
            {
                do
                {
                    Visit(context.block());

                } while (condition(Visit(context.expression())));
            }
            else
            {
                Visit(context.block());
            }

            return null;
        }

        public override object? VisitIfBlock([NotNull] LenguajeParser.IfBlockContext context)
        {
            object? expressionResult = Visit(context.expression()); // Evaluar la expresión
            bool condition = IsTrue(expressionResult); // Convertir el resultado a un bool

            if (condition)
            {
                // Si la condición es verdadera, visitar el bloque asociado al 'if'.
                Visit(context.block());
            }
            else if (context.elseifBlock() != null)
            {
                // Si la condición es falsa y existe un bloque 'else if', visitarlo.
                Visit(context.elseifBlock());
            }

            if (context.elseifBlock() != null)
            {
                // Si hay un bloque 'else', visitarlo.
                Visit(context.elseifBlock());
            }

            return null;
        }

        public override object? VisitComparativos(LenguajeParser.ComparativosContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));
            var op = context.compareOp().GetText();

            return op switch
            {
                "==" => IsEquals(left, right),
                "!=" => NotEquals(left, right),
                ">" => GreaterThan(left, right),
                "<" => LessThan(left, right),
                ">=" => GreaterThanOrEquals(left, right),
                "<=" => LessThanOrEquals(left, right),
                _ => throw new NotImplementedException()
            };
        }


        private object? Add(object? left, object? right)
        {
            if (left is int l && right is int r)
                return l + r;

            if (left is float lf && right is float rf)
                return lf + rf;

            if (left is int lInt && right is float rFloat)
                return lInt + rFloat;

            if (left is float lFloat && right is int rInt)
                return lFloat + rInt;

            if (left is string || right is string)
                return $"{left}{right}";

            throw new Exception($"No se puede añadir valores de tipo {left?.GetType()} y {right?.GetType()}");
        }

        private object? Substract(object? left, object? right)
        {
            if (left is int l && right is int r)
                return l - r;

            if (left is float lf && right is float rf)
                return lf - rf;

            if (left is int lInt && right is float rFloat)
                return lInt - rFloat;

            if (left is float lFloat && right is int rInt)
                return lFloat - rInt;

            if (left is string || right is string)
                return $"{left}{right}";

            throw new Exception($"No se puede añadir valores de tipo {left?.GetType()} y {right?.GetType()}");
        }

        private object? Multiply(object? left, object? right)
        {
            if (left is int l && right is int r)
                return l * r;

            if (left is float lf && right is float rf)
                return lf * rf;

            if (left is int lInt && right is float rFloat)
                return lInt * rFloat;

            if (left is float lFloat && right is int rInt)
                return lFloat * rInt;

            if (left is string || right is string)
                return $"{left}{right}";

            throw new Exception($"No se puede añadir valores de tipo {left?.GetType()} y {right?.GetType()}");
        }

        private object? Divide(object? left, object? right)
        {
            if (left is int l && right is int r)
                return l / r;

            if (left is float lf && right is float rf)
                return lf / rf;

            if (left is int lInt && right is float rFloat)
                return lInt / rFloat;

            if (left is float lFloat && right is int rInt)
                return lFloat / rInt;

            if (left is string || right is string)
                return $"{left}{right}";

            throw new Exception($"No se puede añadir valores de tipo {left?.GetType()} y {right?.GetType()}");
        }

        private object? Power(object? left, object? right)
        {
            if (left is int l && right is int r)
                return Math.Pow(l, r);
            if (left is float lf && right is float rf)
                return Math.Pow(lf, rf);
            if (left is int lInt && right is float rFloat)
                return Math.Pow(lInt, rFloat);
            if (left is float lFloat && right is int rInt)
                return Math.Pow(lFloat, rInt);
            if (left is string || right is string)
                return $"{left}^{right}";
            throw new Exception($"Cannot calculate power of values of types {left?.GetType()} and {right?.GetType()}");
        }

        private object? Sqrt(object? value)
        {
            if (value is int v)
                return Math.Sqrt(v);

            if (value is float fv)
                return Math.Sqrt(fv);

            if (value is string s)
            {
                double number;
                if (double.TryParse(s, out number))
                {
                    return Math.Sqrt(number);
                }
                else
                {
                    throw new ArgumentException("Invalid string input for square root");
                }
            }
            throw new ArgumentException("Invalid type for square root");
        }

        private bool IsTrue (object? value)
        {
            if (value is bool b)
                return b;

            throw new Exception("El valor no es booleano");
        }

        public bool IsFalse(object? value) => !IsTrue(value);

        private object? IsEquals(object? left, object? right)
        {
            if (left is int l && right is int r)
                return l = r;

            if (left is float lf && right is float rf)
                return lf = rf;

            if (left is float lFloat && right is int rInt)
                return lFloat = rInt;

            if (left is string || right is string)
                return $"{left}{right}";

            throw new Exception($"No se puede añadir valores de tipo {left?.GetType()} y {right?.GetType()}");
        }

        private object? NotEquals(object? left, object? right)
        {
            if (left is int l && right is int r)
                return l != r;

            if (left is float lf && right is float rf)
                return lf != rf;

            if (left is int lInt && right is float rFloat)
                return lInt != rFloat;

            if (left is float lFloat && right is int rInt)
                return lFloat != rInt;

            if (left is string || right is string)
                return $"{left}{right}";

            throw new Exception($"No se puede añadir valores de tipo {left?.GetType()} y {right?.GetType()}");
        }

        private object? GreaterThan(object? left, object? right)
        {
            if (left is int l && right is int r)
                return l > r;

            if (left is float lf && right is float rf)
                return lf > rf;

            if (left is int lInt && right is float rFloat)
                return lInt > rFloat;

            if (left is float lFloat && right is int rInt)
                return lFloat > rInt;

            if (left is string || right is string)
                return $"{left}{right}";

            throw new Exception($"No se puede añadir valores de tipo {left?.GetType()} y {right?.GetType()}");
        }

        private object? LessThan(object? left, object? right)
        {
            if (left is int l && right is int r)
                return l < r;

            if (left is float lf && right is float rf)
                return lf < rf;

            if (left is int lInt && right is float rFloat)
                return lInt < rFloat;

            if (left is float lFloat && right is int rInt)
                return lFloat < rInt;

            if (left is string || right is string)
                return $"{left}{right}";

            throw new Exception($"No se puede añadir valores de tipo {left?.GetType()} y {right?.GetType()}");
        }

        private object? GreaterThanOrEquals(object? left, object? right)
        {
            if (left is int l && right is int r)
                return l >= r;

            if (left is float lf && right is float rf)
                return lf >= rf;

            if (left is int lInt && right is float rFloat)
                return lInt >= rFloat;

            if (left is float lFloat && right is int rInt)
                return lFloat >= rInt;

            if (left is string || right is string)
                return $"{left}{right}";

            throw new Exception($"No se puede añadir valores de tipo {left?.GetType()} y {right?.GetType()}");
        }

        private object? LessThanOrEquals(object? left, object? right)
        {
            if (left is int l && right is int r)
                return l <= r;

            if (left is float lf && right is float rf)
                return lf <= rf;

            if (left is int lInt && right is float rFloat)
                return lInt <= rFloat;

            if (left is float lFloat && right is int rInt)
                return lFloat <= rInt;

            if (left is string || right is string)
                return $"{left}{right}";

            throw new Exception($"No se puede añadir valores de tipo {left?.GetType()} y {right?.GetType()}");
        }

        private object? Write(object?[] args)
        {
            foreach (var arg in args)
            {
                Console.WriteLine(arg);
            }

            return null;
        }
    }
}
