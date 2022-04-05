package expression;

import antlr.SNBBaseVisitor;
import antlr.SNBParser;
import views.MainApplication;


import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends SNBBaseVisitor<Program> {
    public List<String> semanticErrors; //to be accessed by main application program


    @Override
    public Program visitProgram(SNBParser.ProgramContext ctx) {
        Program program = new Program();

        semanticErrors = new ArrayList<>();
        AntlrToExpression expressionVisitor = new AntlrToExpression(semanticErrors); //A helper visitor for transforming each subtree into a Expression
        //Object

        for (int index=1; index<ctx.getChildCount(); index++) {
            if (index == ctx.getChildCount() - 1) {
                //Last child of start symbol program ia EOF
                //Do not visit this child and attempt to convert to a Declaration object
                if (MainApplication.debugCalled) {
                    MainApplication.debugResultsTextArea.append("Found EOF \n");
                }
                //System.out.println("Found EOf");
            }else if (index == ctx.getChildCount() - 2) {
                //Second to last child of start symbol is 'BNS'
                //Do not visit this child and attempt to convert to a Declaration object
                if (MainApplication.debugCalled) {
                    MainApplication.debugResultsTextArea.append("Found BNS \n");
                }
                //System.out.println("Found BNS");
            }else {
                program.addExpression(expressionVisitor.visit(ctx.getChild(index)));
            }
        }

        return program;
    }
}
