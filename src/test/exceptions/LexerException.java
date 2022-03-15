package test.exceptions;

public class LexerException extends RuntimeException {
    public LexerException() {
        super("Exception occurred while Lexical Tokenizing");
    }

    public LexerException(String message) {
        super(message);
    }

    public LexerException(String message, Throwable causeOfException) {
        super(message,causeOfException);
    }
}
