grammar Lenguaje;

program: line* EOF;

line: statement | ifBlock | whileBlock | forBlock;

statement: (assignment | matrixDeclaration | functionCall) ';';

ifBlock: IF '(' expression ')' block (elseifBlock | elseBlock)?;

IF: 'if';
ELSE: 'else';

elseifBlock: ELSE IF '(' expression ')' block (elseBlock)?;

elseBlock: ELSE block (elseBlock)?;

whileBlock: WHILE '(' expression ')' block;

WHILE: 'while' | 'until';

forBlock: FOR '(' assignment ';' expression? ';' assignment ')' block;

FOR: 'for';

// Declaraci�n de matrices
matrixDeclaration: IDENTIFIER '=' '[' row (',' row)* ']';

// Definici�n de una fila
row: '[' expression (',' expression)* ']';

indexAccess: IDENTIFIER '[' expression ']' ('[' expression ']')?;

assignment: IDENTIFIER '=' expression;

functionCall: IDENTIFIER '(' (expression (',' expression)*)? ')';

expression
    : constant                          #Constantes
    | IDENTIFIER                        #Identificadores
    | indexAccess                       #Indices
    | functionCall                      #LlamadoFunciones
    | '(' expression ')'                #Parentesis
    | '!' expression                    #ExpresionNO
    | expression powOp expression       #Potencia
    | expression sqrtOp expression      #Raiz
    | expression multOp expression      #MulDiv
    | expression addOp expression       #SumaResta
    | expression compareOp expression   #Comparativos
    | expression boolOp expression      #Booleanos
    ;

powOp: '^' ;
sqrtOp: 'raiz' ;
multOp: '*' | '/' ;
addOp: '+' | '-' ;
compareOp: '==' | '!=' | '>' | '<' | '>=' | '<=' ;
boolOp: BOOL_OPERATOR;

BOOL_OPERATOR: 'and' | 'or' | 'xor' ;

constant: INTEGER | FLOAT | DOUBLE | STRING | BOOL | NULL;

INTEGER: [0-9]+ ;
FLOAT: [0-9]+ '.' [0-9]+ ;
DOUBLE: [0-9]+ '.' [0-9]+ ('e'|'E') [+-]?[0-9]+;
STRING: ('"' ~'"'* '"') | ('\'' ~'\''* '\'');
BOOL: 'true' | 'false';
NULL: 'null' ;

block: '{' line* '}';

WS: [ \t\r\n]+ -> skip;
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
