grammar Lenguaje;

program: line* EOF;

line: statement | ifBlock | whileBlock;

statement: (assignment|functionCall) ';';

ifBlock: IF expression block ('else' elseifBlock);

IF: 'si';

elseifBlock: block | ifBlock;

whileBlock: WHILE expression block ('else' elseifBlock);

WHILE: 'mientras' | 'hasta';

assignment: IDENTIFIER '=' expression;

functionCall: IDENTIFIER '(' (expression (',' expression)*)? ')';

expression
    : constant                          #Constantes
    | IDENTIFIER                        #Identificadores
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
IDENTIFIER: [a-zA-Z0-9_][a-zA-Z0-9_]*;