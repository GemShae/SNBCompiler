package domain;

import antlr.SNBLexer;
import antlr.SNBParser;
import expression.AntlrToProgram;
import expression.ExpressionProcessor;
import expression.Program;
import expression.error.SyntaxErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class CompilerApp {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: filename \n");
        }else {
            String filename = args[0];
            SNBParser snbParser = getParser(filename);

            //Tell ANTLR to build a parse tree
            //Parse from the start symbol - 'program'
            ParseTree antlrAST = snbParser.program();

            if (SyntaxErrorListener.hasError) {
                //Let the Syntax error be reported
                System.out.println("Syntax error found.");
            }
            else {
                //Create a visitor for converting the parse tree into Program/Declaration Objects
                AntlrToProgram programVisitor = new AntlrToProgram();
                Program program = programVisitor.visit(antlrAST);

                if (programVisitor.semanticErrors.isEmpty()) {
                    ExpressionProcessor expressionProcessor = new ExpressionProcessor(program.expressions);
                    for (String evaluation : expressionProcessor.getEvaluationResults()) {
                        System.out.println(evaluation);
                    }
                }
                else {
                    for (String error : programVisitor.semanticErrors) {
                        System.out.println(error);
                    }
                }
            }
        }
    }

    private static SNBParser getParser(String fileName) {
        SNBParser snbParser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName); //character stream from sourcecode
            SNBLexer snbLexer = new SNBLexer(input); //takes the source input and runs it into the lexical analyzer
            CommonTokenStream tokenStream = new CommonTokenStream(snbLexer); //produces tokens or lexical units
            snbParser = new SNBParser(tokenStream); //inputs tokens into parser of syntax analyzer which will produce a tree

            //Syntax Error Handling
            snbParser.removeErrorListeners();
            snbParser.addErrorListener(new SyntaxErrorListener());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return snbParser;
    }
}
