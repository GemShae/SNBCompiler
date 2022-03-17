package domain;

import antlr.SNBLexer;
import antlr.SNBParser;
import declaration.AntlrToProgram;
import declaration.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class CompilerApp {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: filename");
        }else {
            String filename = args[0];
            SNBParser snbParser = getParser(filename);

            //Tell ANTLR to build a parse tree
            //Parse from the start symbol - 'program'
            ParseTree antlrAST = snbParser.program();

            //Create a visitor for converting the parse tree into Program/Declaration Objects
            AntlrToProgram programVisitor = new AntlrToProgram();
            Program program = programVisitor.visit(antlrAST);
        }
    }

    private static SNBParser getParser(String fileName) {
        SNBParser snbParser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName); //character stream from sourcecode
            SNBLexer snbLexer = new SNBLexer(input); //takes the source input and runs it into the lexical analyzer
            CommonTokenStream tokenStream = new CommonTokenStream(snbLexer); //produces tokens or lexical units
            snbParser = new SNBParser(tokenStream); //inputs tokens into parser of syntax analyzer which will produce a tree
        } catch (IOException e) {
            e.printStackTrace();
        }

        return snbParser;
    }
}
