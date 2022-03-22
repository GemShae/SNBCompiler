package expression;

import antlr.SNBBaseVisitor;
import antlr.SNBParser;
import expression.model.expression.*;
import expression.model.mutable.*;
import expression.model.statement.Assignment;
import expression.model.statement.Print;
import expression.model.variable.*;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AntlrToExpression extends SNBBaseVisitor<Expression> {
    private final Map<String, String> variables; //Stores all variables declared in program so far. Variable name, datatype
    private final List<String> semanticErrors; //Duplicate declaration or reference to undeclared declaration

    public AntlrToExpression(List<String> semanticErrors) {
        this.semanticErrors = semanticErrors;
        variables = new HashMap<>();
    }

/*    @Override
    public Expression visitIntegerDeclaration(SNBParser.IntegerDeclarationContext ctx) {
        String dataType = ctx.INTDATATYPE().getText();

        Token integerVariableToken = ctx.VARIABLE().getSymbol();
        int lineNumber = integerVariableToken.getLine();
        int columnNumber = integerVariableToken.getCharPositionInLine() + 1;

        String integerVariable = ctx.VARIABLE().getText();

        //Maintaining the variable list for semantic error reporting
        if (variables.containsKey(integerVariable)) {
            semanticErrors.add("Error: Variable " + integerVariable + "already declared (" + lineNumber + ", " +
                    columnNumber + ")");
        }
        else {
            variables.put(integerVariable,"int");
        }

        int value = Integer.parseInt(ctx.INT().getText());

        return new IntegerVariableDeclaration(dataType,integerVariable,value);
    } */

    @Override
    public Expression visitFloatDeclaration(SNBParser.FloatDeclarationContext ctx) {
        String dataType = ctx.FLOATDATATYPE().getText();

        Token floatVariableToken = ctx.VARIABLE().getSymbol();
        int lineNumber = floatVariableToken.getLine();
        int columnNumber = floatVariableToken.getCharPositionInLine() + 1;
        String floatVariable = ctx.VARIABLE().getText();

        if (variables.containsKey(floatVariable)) {
            semanticErrors.add("Error: Variable " + floatVariable + " already declared (" + lineNumber + ", " +
                    columnNumber + ")");
        }else {
            variables.put(floatVariable,"float");
        }

        float value = Float.parseFloat(ctx.FLOAT().getText());

        return new FloatVariableDeclaration(dataType,floatVariable,value);
    }

    @Override
    public Expression visitStringDeclaration(SNBParser.StringDeclarationContext ctx) {
        String dataType = ctx.STRINGDATATYPE().getText();

        Token stringVariableToken = ctx.VARIABLE().getSymbol();
        int lineNumber = stringVariableToken.getLine();
        int columnNumber = stringVariableToken.getCharPositionInLine() + 1;
        String stringVariable = ctx.VARIABLE().getText();

        if (variables.containsKey(stringVariable)) {
            semanticErrors.add("Error: Variable " + stringVariable + " already declared (" + lineNumber + ", " +
                    columnNumber + ")");
        }else {
            variables.put(stringVariable,"string");
        }

        String value = ctx.STRING().getText();

        return new StringVariableDeclaration(dataType,stringVariable,value);
    }

/*    @Override
    public Expression visitCharacterDeclaration(SNBParser.CharacterDeclarationContext ctx) {
        String dataType = ctx.CHARDATATYPE().getText();

        Token charVariableToken = ctx.VARIABLE().getSymbol();
        int lineNumber = charVariableToken.getLine();
        int columnNumber = charVariableToken.getCharPositionInLine() + 1;
        String charVariable = ctx.VARIABLE().getText();

        if (variables.containsKey(charVariable)) {
            semanticErrors.add("Error: Variable " + charVariable + "already declared (" + lineNumber + ", " +
                    columnNumber + ")");
        }else {
            variables.put(charVariable,"char");
        }

        char value = charVariable.charAt(0);

        return new CharacterVariableDeclaration(dataType,charVariable,value);
    } */


/*    @Override
    public Expression visitBooleanDeclaration(SNBParser.BooleanDeclarationContext ctx) {
        String dataType = ctx.BOOLDATATYPE().getText();

        Token booleanVariableToken = ctx.VARIABLE().getSymbol();
        int lineNumber = booleanVariableToken.getLine();
        int columnNumber = booleanVariableToken.getCharPositionInLine() + 1;
        String booleanVariable = ctx.VARIABLE().getText();

        if (variables.containsKey(booleanVariable)) {
            semanticErrors.add("Error: Variable " + booleanVariable + "already declared (" + lineNumber + ", " +
                    columnNumber + ")");
        }else {
            variables.put(booleanVariable,"boolean");
        }

        boolean value = Boolean.parseBoolean(ctx.BOOL().getText());

        return new BooleanVariableDeclaration(dataType,booleanVariable,value);
    } */

    @Override
    public Expression visitStatement(SNBParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Expression visitPrintStatement(SNBParser.PrintStatementContext ctx) {
        String command = ctx.SHOW().getText();
        List<Expression> toPrint = new ArrayList<>();

        for (int index=1; index<ctx.getChildCount(); index++) {
            String tokenName = ctx.getChild(index).getText();
            if (tokenName.equals(ctx.COMMA().toString())) {
                System.out.println("Comma found in print statement");
            }else {
                toPrint.add(visit(ctx.getChild(index)));
            }
        }

        return new Print(command,toPrint);
    }

    @Override
    public Expression visitMultiplication(SNBParser.MultiplicationContext ctx) {
        Expression leftChild = visit(ctx.getChild(0)); //Recursively visit the left subtree of the current multiplication expression node
        Expression rightChild = visit(ctx.getChild(2));

        return new Multiplication(leftChild,rightChild);
    }

    @Override
    public Expression visitAddition(SNBParser.AdditionContext ctx) {
        Expression leftChild = visit(ctx.getChild(0));
        Expression rightChild = visit(ctx.getChild(2));

        return new Addition(leftChild,rightChild);
    }

    @Override
    public Expression visitVariable(SNBParser.VariableContext ctx) {
        Token variableName = ctx.VARIABLE().getSymbol();

        int lineNumber = variableName.getLine();
        int columnNumber = variableName.getCharPositionInLine() + 1;

        String variable = ctx.VARIABLE().getText();

        //Maintaining the variable list for semantic error reporting
        if (!variables.containsKey(variable)) {
            semanticErrors.add("Error: Variable " + variable + " not declared (" + lineNumber + ", " +
                    columnNumber + ")");
        }

        return new VariableName(variable);
    }

    @Override
    public Expression visitExponential(SNBParser.ExponentialContext ctx) {
        Expression leftChild = visit(ctx.getChild(0));

        Double power = Double.parseDouble(ctx.FLOAT().getText());

        return new Exponential(leftChild,power);
    }

    @Override
    public Expression visitString(SNBParser.StringContext ctx) {
        return new StringMutable(ctx.STRING().getText());
    }

    @Override
    public Expression visitAssignment(SNBParser.AssignmentContext ctx) {
        Token variableName = ctx.VARIABLE().getSymbol();

        int lineNumber = variableName.getLine();
        int columnNumber = variableName.getCharPositionInLine() + 1;

        String variable = ctx.VARIABLE().getText();

        //Maintaining the variable list for semantic error reporting
        if (!variables.containsKey(variable)) {
            semanticErrors.add("Error: Variable " + variable + " not declared (" + lineNumber + ", " +
                    columnNumber + ")");
        }

        Expression toAssign = visit(ctx.getChild(3));

        return new Assignment(variable,toAssign);
    }

    @Override
    public Expression visitBracketExpression(SNBParser.BracketExpressionContext ctx) {
        Expression middle = visit(ctx.getChild(1));

        return new Bracket(middle);
    }

/*    @Override
    public Expression visitInteger(SNBParser.IntegerContext ctx) {
        String integerText = ctx.INT().getText();
        int integerNumber = Integer.parseInt(integerText);
        return new IntegerNumber(integerNumber);
    } */

    @Override
    public Expression visitFloat(SNBParser.FloatContext ctx) {
        return new FloatNumber(Float.parseFloat(ctx.FLOAT().getText()));
    }

    @Override
    public Expression visitSubtraction(SNBParser.SubtractionContext ctx) {
        Expression leftChild = visit(ctx.getChild(0));
        Expression rightChild = visit(ctx.getChild(2));

        return new Subtraction(leftChild,rightChild);
    }

    @Override
    public Expression visitDivision(SNBParser.DivisionContext ctx) {
        Expression leftChild = visit(ctx.getChild(0));
        Expression rightChild = visit(ctx.getChild(2));

        return new Division(leftChild,rightChild);
    }

/*    @Override
    public Expression visitBoolean(SNBParser.BooleanContext ctx) {
        return new BooleanBool(Boolean.getBoolean(ctx.BOOL().getText()));
    } */
}
