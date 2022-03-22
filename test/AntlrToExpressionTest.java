/*package test;

import antlr.SNBBaseVisitor;
import antlr.SNBParser;
import expression.Expression;
import expression.model.mutable.IntegerNumber;
import expression.model.expression.Multiplication;
import expression.model.expression.Addition;
import NotUsing.IntegerVariableDeclaration;
import expression.model.mutable.VariableName;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class AntlrToExpressionTest extends SNBBaseVisitor<Expression> {
    private List<String> variables; //Stores all variables declared in program so far
    private List<String> semanticErrors; //Duplicate declaration or reference to undeclared declaration

    public AntlrToExpressionTest(List<String> semanticErrors) {
        variables = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Expression visitVariableDeclaration(SNBParser.VariableDeclarationContext ctx) {
        String define = ctx.getChild(0).getText();
        String dataType = ctx.getChild(1).getText();

        //VARIABLE() is a method generated to correspond to the token variable in the source grammar
        Token variableToken = ctx.VARIABLE().getSymbol(); //Same thing as ctx.getChild(0).getSymbol()
        int lineNumber = variableToken.getLine();
        int columnNumber = variableToken.getCharPositionInLine() + 1;

        String variableName = ctx.getChild(2).getText();
        //Maintaining the variable list for semantic error reporting
        if (variables.contains(variableName)) {
            semanticErrors.add("Error: Variable " + variableName + "already declared (" + lineNumber + ", " +
                    columnNumber + ")");
        }
        else {
            variables.add(variableName);
        }

        String testValue = ctx.getChild(4).getText();
        if (dataType.equalsIgnoreCase("int")) {
            try {
                int integer = Integer.parseInt(testValue);
                String realValue = String.valueOf(integer);
            }catch (NumberFormatException e){
                semanticErrors.add(testValue + "is not of type " + dataType);
            }
        }//Do the rest

        return new IntegerVariableDeclaration(dataType,variableName,testValue);
    }

    @Override
    public Expression visitStatement(SNBParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Expression visitPrintStatement(SNBParser.PrintStatementContext ctx) {
        return super.visitPrintStatement(ctx);
    }

    @Override
    public Expression visitSumExpression(SNBParser.SumExpressionContext ctx) {
        Expression leftChild = visit(ctx.getChild(0)); //Recursively visit the left subtree of the current sum expression node
        Expression rightChild = visit(ctx.getChild(2));
        String symbol = ctx.SUMOPERATORS().getText();

        return new Addition(leftChild,symbol,rightChild);
    }

    @Override
    public Expression visitMultiplyExpression(SNBParser.MultiplyExpressionContext ctx) {
        Expression leftChild = visit(ctx.getChild(0)); //Recursively visit the left subtree of the current multiplication expression node
        Expression rightChild = visit(ctx.getChild(2));
        String symbol = ctx.MULTIPLYOPERATOR().getText();

        return new Multiplication(leftChild,symbol,rightChild);
    }

    @Override
    public Expression visitVariable(SNBParser.VariableContext ctx) {
        Token variableNameToken = ctx.VARIABLE().getSymbol();
        int lineNumber = variableNameToken.getLine();
        int columnNumber = variableNameToken.getCharPositionInLine() + 1;

        String variableName = ctx.VARIABLE().getText();

        if (!variables.contains(variableName)) {
            semanticErrors.add("Error: Variable " + variableName + "not declared (" + lineNumber + ", " +
                    columnNumber + ")");
        }

        return new VariableName(variableName);
    }

    @Override
    public Expression visitInteger(SNBParser.IntegerContext ctx) {
        String integerText = ctx.getChild(0).getText();
        int integerNumber = Integer.parseInt(integerText);
        return new IntegerNumber(integerNumber);
    }

    @Override
    public Expression visitFloat(SNBParser.FloatContext ctx) {
        return super.visitFloat(ctx);
    }

    @Override
    public Expression visitCharacter(SNBParser.CharacterContext ctx) {
        return super.visitCharacter(ctx);
    }

    @Override
    public Expression visitBoolean(SNBParser.BooleanContext ctx) {
        return super.visitBoolean(ctx);
    }

    @Override
    public Expression visitString(SNBParser.StringContext ctx) {
        return super.visitString(ctx);
    }
} */
