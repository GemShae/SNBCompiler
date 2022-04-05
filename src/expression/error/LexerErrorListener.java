package expression.error;

import org.antlr.v4.runtime.*;
import views.MainApplication;

public class LexerErrorListener extends BaseErrorListener {
    public static boolean hasError = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        //super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        hasError = true;

        System.err.println("Lexical/Token Error!");
        MainApplication.displayRunResultsTextArea.append("Lexical/Token Error! \n");
        System.err.println("(Line: " + line + ", column: " + (charPositionInLine+1) + "): " + msg);
        MainApplication.displayRunResultsTextArea.append("(Line: " + line + ", column: " + (charPositionInLine+1) + "): " + msg);
    }
}
