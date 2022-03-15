package declaration;

import antlr.SNBBaseVisitor;
import antlr.SNBParser;
import declaration.model.mutable.IntegerNumber;
import declaration.model.expression.Multiplication;
import declaration.model.expression.Sum;
import declaration.model.variable.VariableDeclaration;
import declaration.model.variable.VariableName;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class AntlrToDeclaration extends SNBBaseVisitor<Declaration> {
    private List<String> variables; //Stores all variables declared in program so far
    private List<String> semanticErrors; //Duplicate declaration or reference to undeclared declaration

    public AntlrToDeclaration(List<String> semanticErrors) {
        variables = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Declaration visitVariableDeclaration(SNBParser.VariableDeclarationContext ctx) {
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

        return new VariableDeclaration(define,dataType,variableName,testValue);
    }

    @Override
    public Declaration visitStatement(SNBParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Declaration visitExpressionStatement(SNBParser.ExpressionStatementContext ctx) {
        return super.visitExpressionStatement(ctx);
    }

    @Override
    public Declaration visitSelectStatement(SNBParser.SelectStatementContext ctx) {
        return super.visitSelectStatement(ctx);
    }

    @Override
    public Declaration visitIterationStatement(SNBParser.IterationStatementContext ctx) {
        return super.visitIterationStatement(ctx);
    }

    @Override
    public Declaration visitIterationRange(SNBParser.IterationRangeContext ctx) {
        return super.visitIterationRange(ctx);
    }

    @Override
    public Declaration visitPrintStatement(SNBParser.PrintStatementContext ctx) {
        return super.visitPrintStatement(ctx);
    }

    @Override
    public Declaration visitExpression(SNBParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Declaration visitSimpleExpression(SNBParser.SimpleExpressionContext ctx) {
        return super.visitSimpleExpression(ctx);
    }

    @Override
    public Declaration visitAndExpression(SNBParser.AndExpressionContext ctx) {
        return super.visitAndExpression(ctx);
    }

    @Override
    public Declaration visitUnaryRelationExpression(SNBParser.UnaryRelationExpressionContext ctx) {
        return super.visitUnaryRelationExpression(ctx);
    }

    @Override
    public Declaration visitRelationExpression(SNBParser.RelationExpressionContext ctx) {
        return super.visitRelationExpression(ctx);
    }

    @Override
    public Declaration visitSumExpression(SNBParser.SumExpressionContext ctx) {
        Declaration leftChild = visit(ctx.getChild(0)); //Recursively visit the left subtree of the current sum expression node
        Declaration rightChild = visit(ctx.getChild(2));
        String symbol = ctx.SUMOPERATORS().getText();

        return new Sum(leftChild,symbol,rightChild);
    }

    @Override
    public Declaration visitMultiplyExpression(SNBParser.MultiplyExpressionContext ctx) {
        Declaration leftChild = visit(ctx.getChild(0)); //Recursively visit the left subtree of the current multiplication expression node
        Declaration rightChild = visit(ctx.getChild(2));
        String symbol = ctx.MULTIPLYOPERATOR().getText();

        return new Multiplication(leftChild,symbol,rightChild);
    }

    @Override
    public Declaration visitUnaryExpression(SNBParser.UnaryExpressionContext ctx) {
        return super.visitUnaryExpression(ctx);
    }

    @Override
    public Declaration visitFactor(SNBParser.FactorContext ctx) {
        return super.visitFactor(ctx);
    }

    @Override
    public Declaration visitVariable(SNBParser.VariableContext ctx) {
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
    public Declaration visitInteger(SNBParser.IntegerContext ctx) {
        String integerText = ctx.getChild(0).getText();
        int integerNumber = Integer.parseInt(integerText);
        return new IntegerNumber(integerNumber);
    }

    @Override
    public Declaration visitFloat(SNBParser.FloatContext ctx) {
        return super.visitFloat(ctx);
    }

    @Override
    public Declaration visitCharacter(SNBParser.CharacterContext ctx) {
        return super.visitCharacter(ctx);
    }

    @Override
    public Declaration visitBoolean(SNBParser.BooleanContext ctx) {
        return super.visitBoolean(ctx);
    }

    @Override
    public Declaration visitString(SNBParser.StringContext ctx) {
        return super.visitString(ctx);
    }
}
