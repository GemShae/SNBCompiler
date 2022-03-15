grammar SNB;

/* @header {
    package antlr;
} */

//Tokens
WS: [ \n\t\r]+ -> skip; //Should be ignored
LINE_COMMENT: '--' ~[\r\n]* -> skip; //Should be ignored
//COMMENT: '/*/ .*? */' -> skip; //Match /* stuff */ COME BACK TO THIS

    //Keywords - Tokens
VOID: 'void';
TRUE: 'true';
FALSE: 'false';
STARTPROGRAM: 'SNB';
ENDPROGRAM: 'BNS';
OBRACKET: '(';
CBRACKET: ')';
OCBRACE: '{';
CCBRACE: '}';
POINT: '.';
COMMA: ',';
DOUBLEQUOTE: '"';
DEFINE: 'def';
EQUAL: '=';
IF: 'if';
THEN: 'then';
ELSE: 'else';
ENDIF: 'endif';
WHILE: 'while';
DO: 'do';
ENDWHILE: 'endwhile';
FOR: 'for';
ENDFOR: 'endfor';
TO: 'to';
BY: 'by';
RETURN: 'return';
BREAK: 'break';
SHOW: 'show';
OR: 'or';
AND: 'and';
NOT: 'not';
DATATYPE: 'int' | 'float' | 'char' | 'string' | 'bool';
SIMPLIFYOPERATORS: '+=' | '-=' | '*=' | '/=' | '++' | '--';
RELATIONOPERATORS: '<=' | '<' | '>' | '>=' | '==' | '!=';
SUMOPERATORS: '+' | '-';
MULTIPLYOPERATOR: '*' | '/' | '%';
POWEROPERATOR: '^';
NEGATIVE: '-';

INT: NEGATIVE? DIGIT+;
FLOAT: INT POINT DIGIT+ | POINT DIGIT+ | INT;

BOOL: TRUE | FALSE;
STRING: DOUBLEQUOTE CHAR* DOUBLEQUOTE;
VARIABLE: [a-z][a-zA-Z0-9_]*; //Same as identifiers
CHAR: [a-zA-Z];

DIGIT: [0-9];
//DIGLET: DIGIT | LETTERS;
//LETTERS: CHAR+;

//Rules
program: STARTPROGRAM (variableDeclaration | statement)+ ENDPROGRAM EOF; //Start Rule
//declarationList: declaration | declaration declarationList;
//declaration: variableDeclaration | statement; //functionDeclaration |

variableDeclaration: DEFINE DATATYPE VARIABLE EQUAL (INT | FLOAT | STRING | CHAR | BOOL);
//variableDeclarationList: variableInitialization; //| variableInitialization COMMA variableDeclarationList;
//variableInitialization: VARIABLE EQUAL (INT | FLOAT | STRING | CHAR | BOOL); //variableDeclarationName |
//variableDeclarationName: VARIABLE;
//dataType: 'int' | 'float' | 'char' | 'string' | 'bool';

/* functionDeclaration: dataType VARIABLE OBRACKET parameter CBRACKET OCBRACE statement CCBRACE
    | VOID VARIABLE OBRACKET parameter CBRACKET OCBRACE statement CCBRACE;
parameter: parameterList | ' ';
parameterList: parameterTypeList | parameterTypeList ';' parameterList;
parameterTypeList: dataType parameterVariableList;
parameterVariableList: parameterVariable | parameterVariable COMMA parameterVariableList;
parameterVariable: VARIABLE; */

statement: expressionStatement
    | selectStatement
    | iterationStatement
    | printStatement;
//returnStatement | breakStatement | compoundStatement |

expressionStatement: expression;

/*compoundStatement: localDeclaration statementList;
localDeclaration: variableDeclaration+;
statementList: statement*; */

selectStatement: IF OBRACKET simpleExpression CBRACKET THEN OCBRACE statement CCBRACE
    | IF OBRACKET simpleExpression CBRACKET THEN OCBRACE statement CCBRACE ELSE OCBRACE statement CCBRACE ENDIF;

iterationStatement: WHILE OBRACKET simpleExpression CBRACKET DO OCBRACE statement CCBRACE ENDWHILE
    | FOR VARIABLE EQUAL iterationRange DO OCBRACE statement CCBRACE ENDFOR;
iterationRange: simpleExpression TO simpleExpression;

//returnStatement: RETURN | RETURN expression | RETURN VARIABLE;
//breakStatement: BREAK;

printStatement: SHOW mutable
    | SHOW expression
    | SHOW (mutable|expression) (COMMA (mutable|expression))+
    ;

expression: mutable EQUAL expression
    | mutable SIMPLIFYOPERATORS expression
    | mutable SIMPLIFYOPERATORS
    | simpleExpression
    ;

simpleExpression: simpleExpression OR andExpression | andExpression;
andExpression: andExpression AND unaryRelationExpression
    | unaryRelationExpression
    ;
unaryRelationExpression: NOT unaryRelationExpression
    | relationExpression
    ;
relationExpression: sumExpression RELATIONOPERATORS sumExpression
    | sumExpression
    ;

//Symbols
//relationOperator: '<=' | '<' | '>' | '>=' | '==' | '!=';

sumExpression: sumExpression SUMOPERATORS multiplyExpression
    | multiplyExpression
    ;

//Symbols
//sumOperator: '+' | '-';

multiplyExpression: multiplyExpression MULTIPLYOPERATOR unaryExpression
    | unaryExpression
    ;

//Symbols
//multiplyOperator: '*' | '/' | '%';

unaryExpression: OBRACKET sumExpression CBRACKET
    | factor
    ;

factor: mutable
    | mutable POWEROPERATOR (INT|FLOAT)
    ;

mutable: VARIABLE # Variable
    | INT # Integer
    | FLOAT # Float
    | CHAR # Character
    | BOOL # Boolean
    | STRING # String
    ;