package expression;

import expression.model.SymbolTable;
import expression.model.expression.*;
import expression.model.mutable.FloatNumber;
import expression.model.mutable.StringMutable;
import expression.model.mutable.VariableName;
import expression.model.statement.Assignment;
import expression.model.statement.Print;
import expression.model.variable.FloatVariableDeclaration;
import expression.model.variable.StringVariableDeclaration;

import java.util.ArrayList;
import java.util.List;

public class ExpressionProcessor {
    public List<Expression> expressionList;
    public List<SymbolTable> variableSymbols; //Symbol table for storing values of variables
    public List<String> semanticErrors;

    public ExpressionProcessor(List<Expression> expressionList) {
        this.expressionList = expressionList;
        this.variableSymbols = new ArrayList<>();
        this.semanticErrors = new ArrayList<>();
    }

    public List<String> getEvaluationResults() {
        List<String> evaluations = new ArrayList<>();

        for (Expression expression : expressionList) {
            //Declarations
/*            if (expression instanceof IntegerVariableDeclaration) {
                IntegerVariableDeclaration integerVariableDeclaration = (IntegerVariableDeclaration) expression;
                variableSymbols.add(new SymbolTable(integerVariableDeclaration.variableName,integerVariableDeclaration.dataType,
                        String.valueOf(integerVariableDeclaration.value)));
            }
            else */
            if (expression instanceof FloatVariableDeclaration floatVariableDeclaration) {
                variableSymbols.add(new SymbolTable(floatVariableDeclaration.variableName, floatVariableDeclaration.dataType,
                        String.valueOf(floatVariableDeclaration.value)));
            }
            else if (expression instanceof StringVariableDeclaration stringVariableDeclaration) {
                variableSymbols.add(new SymbolTable(stringVariableDeclaration.variableName, stringVariableDeclaration.dataType,
                        stringVariableDeclaration.value));
            }/*
            else if (expression instanceof BooleanVariableDeclaration) {
                BooleanVariableDeclaration booleanVariableDeclaration = (BooleanVariableDeclaration) expression;
                variableSymbols.add(new SymbolTable(booleanVariableDeclaration.variableName, booleanVariableDeclaration.dataType,
                        String.valueOf(booleanVariableDeclaration.value)));
            }*/
            else if (expression instanceof Assignment assignment) {

                String variableName = assignment.variableName;

                for (SymbolTable symbolTableVariable : variableSymbols) {
                    if (symbolTableVariable.variableNames.equals(variableName)) {
                        symbolTableVariable.values = getEvaluationResultChild(assignment.value);
                    }
                }
            }
            else if (expression instanceof Print toPrint) {

                StringBuilder allTheStuffToPrint = new StringBuilder();
                List<Expression> printExpression = toPrint.thingsToPrint;

                for (Expression expressionsToPrint : printExpression) {
                    String stringVersionOfToPrint = getEvaluationResultChild(expressionsToPrint);
                    allTheStuffToPrint.append(stringVersionOfToPrint);
                }

                evaluations.add(allTheStuffToPrint.toString());

            }
            else {
                //Expression Statements     NEED TO DEAL WITH ASSIGNMENT AND PRINT SEPARATELY
                String input = expression.toString();
                String result = getEvaluationResultChild(expression);
                evaluations.add(input + " is " + result);
            }
        }

        return evaluations;
    }

    private String getEvaluationResultChild(Expression expression) {
        String result = " ";

        if (expression instanceof FloatNumber floatNumber) {
            result = String.valueOf(floatNumber.floatNumber);
        }
        else if (expression instanceof StringMutable stringMutable) {
            String tempString = stringMutable.aString;
            //System.out.println(newString);
            result = tempString.substring(1,tempString.length()-1);
        }
        else if (expression instanceof VariableName variableName) {
            //result = variableSymbols.get(variableName.variableName);
            for (SymbolTable symbolTableVariable : variableSymbols) {
                if (symbolTableVariable.variableNames.equals(variableName.variableName)) {
                    if (symbolTableVariable.dataType.equals("string")) {
                        String tempString = symbolTableVariable.values;
                        result = tempString.substring(1,tempString.length()-1);
                        break;
                    }
                    result = symbolTableVariable.values;
                    break;
                }
            }
        }
        else if (expression instanceof Addition add) {
            String left = getEvaluationResultChild(add.left);
            String right = getEvaluationResultChild(add.right);

            if (checkFloat(left)) {
                float leftNumber = Float.parseFloat(left);

                if (checkFloat(right)) {
                    float rightNumber = Float.parseFloat(right);
                    float sum = leftNumber+rightNumber;

                    result = String.valueOf(sum);
                }
            }
            else {
                result = left+right;
            }
        }
        else if (expression instanceof Subtraction subtract) {
            String left = getEvaluationResultChild(subtract.left);
            String right = getEvaluationResultChild(subtract.right);

            if (checkFloat(left)) {
                float leftNumber = Float.parseFloat(left);

                if (checkFloat(right)) {
                    float rightNumber = Float.parseFloat(right);
                    float subtraction = leftNumber-rightNumber;

                    result = String.valueOf(subtraction);
                }
            }
            else {
                result = left+right;
            }
        }
        else if (expression instanceof Multiplication multiply) {
            String left = getEvaluationResultChild(multiply.left);
            String right = getEvaluationResultChild(multiply.right);

            if (checkFloat(left)) {
                float leftNumber = Float.parseFloat(left);

                if (checkFloat(right)) {
                    float rightNumber = Float.parseFloat(right);
                    float multiplication = leftNumber*rightNumber;

                    result = String.valueOf(multiplication);
                }
            }
            else {
                result = left+right;
            }
        }
        else if (expression instanceof Division divide) {
            String left = getEvaluationResultChild(divide.left);
            String right = getEvaluationResultChild(divide.right);

            if (checkFloat(left)) {
                float leftNumber = Float.parseFloat(left);

                if (checkFloat(right)) {
                    float rightNumber = Float.parseFloat(right);
                    float division = leftNumber/rightNumber;

                    result = String.valueOf(division);
                }
            }
            else {
                result = left+right;
            }
        }
        else if (expression instanceof Bracket bracket) {

            result = getEvaluationResultChild(bracket.middle);
        }
        else if (expression instanceof Exponential exponential) {
            String left = getEvaluationResultChild(exponential.left);

            if (checkFloat(left)) {
                double base = Double.parseDouble(left);

                double answer = Math.pow(base,exponential.operator);

                result = String.valueOf(answer);
            }
            else {
                result = left;
            }
        }

        return result;
    }

    private boolean checkFloat(String string) {
        try {
            float floatNum = Float.parseFloat(string);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }
}
