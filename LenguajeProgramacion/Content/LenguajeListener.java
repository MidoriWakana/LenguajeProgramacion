// Generated from Lenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LenguajeParser}.
 */
public interface LenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LenguajeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LenguajeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LenguajeParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LenguajeParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LenguajeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LenguajeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(LenguajeParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(LenguajeParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseifBlock(LenguajeParser.ElseifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseifBlock(LenguajeParser.ElseifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(LenguajeParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(LenguajeParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LenguajeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LenguajeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LenguajeParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LenguajeParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionNO}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpresionNO(LenguajeParser.ExpresionNOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionNO}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpresionNO(LenguajeParser.ExpresionNOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identificadores}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentificadores(LenguajeParser.IdentificadoresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identificadores}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentificadores(LenguajeParser.IdentificadoresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparativos}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparativos(LenguajeParser.ComparativosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparativos}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparativos(LenguajeParser.ComparativosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LenguajeParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LenguajeParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(LenguajeParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(LenguajeParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LlamadoFunciones}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLlamadoFunciones(LenguajeParser.LlamadoFuncionesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LlamadoFunciones}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLlamadoFunciones(LenguajeParser.LlamadoFuncionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constantes}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(LenguajeParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constantes}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(LenguajeParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSumaResta(LenguajeParser.SumaRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSumaResta(LenguajeParser.SumaRestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Booleanos}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanos(LenguajeParser.BooleanosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Booleanos}
	 * labeled alternative in {@link LenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanos(LenguajeParser.BooleanosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(LenguajeParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(LenguajeParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(LenguajeParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(LenguajeParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(LenguajeParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(LenguajeParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(LenguajeParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(LenguajeParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(LenguajeParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(LenguajeParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LenguajeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LenguajeParser.BlockContext ctx);
}