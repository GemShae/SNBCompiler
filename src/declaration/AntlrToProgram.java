package declaration;

import antlr.SNBBaseVisitor;
import antlr.SNBParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends SNBBaseVisitor<Program> {
    private List<String> semanticErrors; //to be accessed by main application program


    @Override
    public Program visitProgram(SNBParser.ProgramContext ctx) {
        Program program = new Program();

        semanticErrors = new ArrayList<>();
        AntlrToDeclaration declarationVisitor = new AntlrToDeclaration(semanticErrors); //A helper visitor for transforming each subtree into a Declaration
        //Object

        for (int index=1; index<ctx.getChildCount(); index++) {
            if (index == ctx.getChildCount() - 1) {
                //Last child of start symbol program ia EOF
                //Do not visit this child and attempt to convert to a Declaration object
                System.out.println("Found EOf");
            }else if (index == ctx.getChildCount() - 2) {
                //Second to last child of start symbol is 'BNS'
                //Do not visit this child and attempt to convert to a Declaration object
                System.out.println("Found BNS");
            }else {
                program.addDeclration(declarationVisitor.visit(ctx.getChild(index)));
            }
        }

        return program;
    }
}
