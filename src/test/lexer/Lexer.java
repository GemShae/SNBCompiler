package test.lexer;

import test.token.Token;
import test.token.support.TokenType;
import test.exceptions.LexerException;

import java.util.Arrays;

public class Lexer {
    private final String code;
    private final int codeLength;

    private int currentIndex;

    private Token currentToken;
    private Token previousToken;

    public Lexer(String code) {
        this.code = code;
        this.currentIndex = 0;
        this.codeLength = code.length();
    }

    //This updates currentToken to the next valid Token if it is available.
    //It returns true if a valid token is available next
    public boolean nextToken() {
        while (!isEndOfCode()) { //To fetch nextToken, if a skipWS occurs
            previousToken = currentToken; //In case previous token is needed

            final char currentChar = code.charAt(currentIndex);

            if (Arrays.asList(' ', '\t', '\n').contains(currentChar)) { //WS
                skipWhiteSpace();
                continue;
            }
            else if (currentChar == '=') { //EQUALS
                String operator = readEqualOperator();
                if (operator.equalsIgnoreCase("=")) {
                    currentToken = new Token(TokenType.EQUAL); //=
                }
                else {
                    currentToken = new Token(TokenType.RELATIONOPERATORS, operator); //==
                }
            }
            else if (currentChar == '<') {


            }
            else if (Character.isDigit(currentChar)) { //INT
                currentToken = new Token(TokenType.INT, readNumber());
            }
            else if (Character.isLetter(currentChar)) {
                String variableName = readVariable();
                if (variableName.equalsIgnoreCase("show")) { //SHOW
                    currentToken = new Token(TokenType.SHOW);
                }
                else {
                    currentToken = new Token(TokenType.VARIABLE, variableName); // Needs to be adjusted
                }
            }
            else {
                throw new LexerException("Token: " + currentToken + "not defined at " + currentIndex + "Index");
            }
            return true;
        }
        return false;
    }

    //return string for which equal operator = or ==
    private String readEqualOperator() {
        StringBuilder stringBuilder = new StringBuilder();
        char currentChar = code.charAt(currentIndex);
        while (!isEndOfCode()) {
            stringBuilder.append(currentChar);
            currentIndex++;
        }
        return stringBuilder.toString();
    }

    /*Read integer as string
    return string value of integer
     */
    private String readNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        char currentChar = code.charAt(currentIndex);
        while (!isEndOfCode() && Character.isDigit(currentChar)) {
            stringBuilder.append(currentChar);
            currentIndex++;
            if (isEndOfCode()) {
                break;
            }
            currentChar = code.charAt(currentIndex);
        }
        return stringBuilder.toString();
    }

    //return String from current index
    private String readVariable() {
        StringBuilder stringBuilder = new StringBuilder();
        char currentChar = code.charAt(currentIndex);
        while (!isEndOfCode() && Character.isLetter(currentChar)) {
            stringBuilder.append(currentChar);
            currentIndex++;
            if (isEndOfCode()) {
                break;
            }
            currentChar = code.charAt(currentIndex);
        }
        return stringBuilder.toString();
    }

    //Skip Whitespace
    private void skipWhiteSpace() {
        while (!isEndOfCode()) {
           if (Arrays.asList(' ', '\t', '\n').contains(code.charAt(currentIndex))) {
               currentIndex++;
           }
           else {
               break;
           }
        }
    }

    //Check if End of Code is reached
    private boolean isEndOfCode() {
        return currentIndex >= codeLength;
    }

    //Get previous token
    public Token getPreviousToken() {
        return previousToken;
    }

    public Token getCurrentToken() {
        return currentToken;
    }

}
