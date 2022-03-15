antlr.grammar SNBFirst;
//Tokens
WS: [ \n\t]+ -> skip;
//LINE_COMMENT: '//' .*? '\n'-> skip; //Match "// stuff \n
//COMMENT: '/*/ .*? */' -> skip; //Match /* stuff */ COME BACK TO THIS

    //Keywords
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

INT: DIGIT+;
FLOAT: INT POINT DIGIT* | POINT DIGIT+ | INT;
CHAR: [a-zA-Z];
BOOL: TRUE | FALSE;
STRING: ('"' 'a'..'z'|'A'..'Z'|'0'..'9'|'_'|'@' '"')+ ;
VARIABLE: LETTERS DIGLET*;

DIGLET: DIGIT | LETTERS;
LETTERS: CHAR+;
DIGIT: [0-9];

//Rules
program: STARTPROGRAM declarationList ENDPROGRAM;
declarationList: declaration | declaration declarationList;
declaration: variableDeclaration | statement; //functionDeclaration |

variableDeclaration: DEFINE DATATYPE variableDeclarationList;
variableDeclarationList: variableInitialization | variableInitialization COMMA variableDeclarationList;
variableInitialization: variableDeclarationName | variableDeclarationName EQUAL simpleExpression;
variableDeclarationName: VARIABLE;
//dataType: 'int' | 'float' | 'char' | 'string' | 'bool';

/* functionDeclaration: dataType VARIABLE OBRACKET parameter CBRACKET OCBRACE statement CCBRACE
    | VOID VARIABLE OBRACKET parameter CBRACKET OCBRACE statement CCBRACE;
parameter: parameterList | ' ';
parameterList: parameterTypeList | parameterTypeList ';' parameterList;
parameterTypeList: dataType parameterVariableList;
parameterVariableList: parameterVariable | parameterVariable COMMA parameterVariableList;
parameterVariable: VARIABLE; */

statement: expressionStatement | compoundStatement | selectStatement | iterationStatement | returnStatement |
    breakStatement | printStatement;

expressionStatement: expression;

compoundStatement: localDeclaration statementList;
localDeclaration: variableDeclaration localDeclaration | WS;
statementList: statement statementList | WS;

selectStatement: IF OBRACKET simpleExpression CBRACKET THEN OCBRACE statement CCBRACE | IF OBRACKET simpleExpression
    CBRACKET THEN OCBRACE statement CCBRACE ELSE OCBRACE statement CCBRACE ENDIF;

iterationStatement: WHILE OBRACKET simpleExpression CBRACKET DO OCBRACE statement CCBRACE ENDWHILE
    | FOR VARIABLE EQUAL iterationRange DO OCBRACE statement CCBRACE ENDFOR;
iterationRange: simpleExpression TO simpleExpression;

returnStatement: RETURN | RETURN expression | RETURN VARIABLE;
breakStatement: BREAK;

printStatement: SHOW mutable | SHOW expression;

expression: mutable EQUAL expression | mutable SIMPLIFYOPERATORS expression | mutable SIMPLIFYOPERATORS | simpleExpression;

simpleExpression: simpleExpression OR andExpression | andExpression;
andExpression: andExpression AND unaryRelationExpression | unaryRelationExpression;
unaryRelationExpression: NOT unaryRelationExpression | relationExpression;
relationExpression: sumExpression RELATIONOPERATORS sumExpression | sumExpression;

//Symbols
//relationOperator: '<=' | '<' | '>' | '>=' | '==' | '!=';

sumExpression: sumExpression SUMOPERATORS multiplyExpression | multiplyExpression;

//Symbols
//sumOperator: '+' | '-';

multiplyExpression: multiplyExpression MULTIPLYOPERATOR unaryExpression | unaryExpression;

//Symbols
//multiplyOperator: '*' | '/' | '%';

unaryExpression: OBRACKET sumExpression CBRACKET | factor;

factor: mutable | mutable POWEROPERATOR INT | mutable POWEROPERATOR FLOAT;

mutable: VARIABLE | INT | FLOAT | CHAR | BOOL | STRING;