grammar SNB;

//Tokens
WS: [ \n\t\r]+ -> skip; //Should be ignored
LINE_COMMENT: '--' ~[\r\n]* -> skip; //Should be ignored

TRUE: 'true';
FALSE: 'false';
STARTPROGRAM: 'SNB';
ENDPROGRAM: 'BNS';
SHOW: 'show';
INTDATATYPE: 'int';
FLOATDATATYPE: 'float';
CHARDATATYPE: 'char';
STRINGDATATYPE: 'string';
BOOLDATATYPE: 'bool';

OBRACKET: '(';
CBRACKET: ')';
OCBRACE: '{';
CCBRACE: '}';
POINT: '.';
COMMA: ',';
DOUBLEQUOTE: '"';
EQUAL: '=';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULUS: '%';
POWEROPERATOR: '^';

INT: MINUS? DIGIT+;
FLOAT: INT POINT DIGIT+ | POINT DIGIT+ | INT POINT '0';
BOOL: TRUE | FALSE;
STRING: DOUBLEQUOTE [ a-zA-Z0-9!@#$%&|?:;.,]* DOUBLEQUOTE;
VARIABLE: [a-z][a-zA-Z0-9_]*; //Same as identifiers
//CHAR: [a-zA-Z];

DIGIT: [0-9];

//Rules
program: STARTPROGRAM (variableDeclaration | statement)+ ENDPROGRAM EOF; //Start Rule

variableDeclaration: INTDATATYPE VARIABLE EQUAL INT #IntegerDeclaration
    | FLOATDATATYPE VARIABLE EQUAL FLOAT #FloatDeclaration
    | STRINGDATATYPE VARIABLE EQUAL STRING #StringDeclaration
//    | CHARDATATYPE VARIABLE EQUAL CHAR #CharacterDeclaration
    | BOOLDATATYPE VARIABLE EQUAL BOOL #BooleanDeclaration
    ;

statement: expressionStatement
    | printStatement;

printStatement: SHOW expressionStatement (COMMA expressionStatement)*;

//To resolve ambiguity, antlr favours the alternative given first
expressionStatement: VARIABLE EQUAL OBRACKET expressionStatement CBRACKET    #Assignment
    | OBRACKET expressionStatement CBRACKET                 #BracketExpression
    | expressionStatement POWEROPERATOR FLOAT               #Exponential
    | expressionStatement MULTIPLY expressionStatement      #Multiplication
    | expressionStatement DIVIDE expressionStatement        #Division
    | expressionStatement PLUS expressionStatement          #Addition
    | expressionStatement MINUS expressionStatement         #Subtraction
    | VARIABLE                                              #Variable
    | INT                                                   #Integer
    | FLOAT                                                 #Float
//    | CHAR                                                  #Character
    | BOOL                                                  #Boolean
    | STRING                                                #String
    ;