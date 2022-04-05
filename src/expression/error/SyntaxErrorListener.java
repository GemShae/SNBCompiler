package expression.error;

import org.antlr.v4.runtime.*;
import views.MainApplication;

import java.util.Collections;
import java.util.List;

public class SyntaxErrorListener extends BaseErrorListener {
    public static boolean hasError = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        //super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        hasError = true;

        List<String> stack = ( (Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("Syntax Error!");
        MainApplication.displayRunResultsTextArea.append("Syntax Error! \n");
        System.err.println("Token \"" + ((Token) offendingSymbol).getText() + " \"" +
                " (line: " + line + ", column: " + (charPositionInLine+1) + " )" +
                ": " + msg);
        MainApplication.displayRunResultsTextArea.append("Token \"" + ((Token) offendingSymbol).getText() + " \"" +
                " (line: " + line + ", column: " + (charPositionInLine+1) + " )" +
                ": " + msg + "\n");
        System.err.println("Rule Stack: " + stack);
        MainApplication.displayRunResultsTextArea.append("Rule Stack: " + stack + "\n");
    }
}
