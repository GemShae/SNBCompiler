package test.token;

import test.token.support.TokenType;

//THIS WOULD BE THE OUTPUT OF LEXER. CONTAINS TokenType and Token Value
public class Token {
    private final TokenType type;
    private final String value;

    public Token(TokenType type) {
        this.type = type;
        this.value = null;
    }

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
