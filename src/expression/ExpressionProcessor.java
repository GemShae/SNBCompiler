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
import views.MainApplication;

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
                if (MainApplication.debugCalled) {
                    MainApplication.debugResultsTextArea.append("Checking instance of Float Variable Declaration \n");
                }

                variableSymbols.add(new SymbolTable(floatVariableDeclaration.variableName, floatVariableDeclaration.dataType,
                        String.valueOf(floatVariableDeclaration.value)));
            }
            else if (expression instanceof StringVariableDeclaration stringVariableDeclaration) {

                if (MainApplication.debugCalled) {
                    MainApplication.debugResultsTextArea.append("Checking instance of String Variable Declaration \n");
                }
                variableSymbols.add(new SymbolTable(stringVariableDeclaration.variableName, stringVariableDeclaration.dataType,
                        stringVariableDeclaration.value));
            }/*
            else if (expression instanceof BooleanVariableDeclaration) {
                BooleanVariableDeclaration booleanVariableDeclaration = (BooleanVariableDeclaration) expression;
                variableSymbols.add(new SymbolTable(booleanVariableDeclaration.variableName, booleanVariableDeclaration.dataType,
                        String.valueOf(booleanVariableDeclaration.value)));
            }*/
            else if (expression instanceof Assignment assignment) {
                if (MainApplication.debugCalled) {
                    MainApplication.debugResultsTextArea.append("Checking instance of Variable Assignment \n");
                }

                String variableName = assignment.variableName;

                for (SymbolTable symbolTableVariable : variableSymbols) {
                    if (symbolTableVariable.variableNames.equals(variableName)) {
                        symbolTableVariable.values = getEvaluationResultChild(assignment.value);
                    }
                }
            }
            else if (expression instanceof Print toPrint) {

                if (MainApplication.debugCalled) {
                    MainApplication.debugResultsTextArea.append("Checking instance of Print Statement \n");
                }

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
            if (MainApplication.debugCalled) {
                MainApplication.debugResultsTextArea.append("Checking instance of a float number \n");
            }
            result = String.valueOf(floatNumber.floatNumber);
        }
        else if (expression instanceof StringMutable stringMutable) {
            if (MainApplication.debugCalled) {
                MainApplication.debugResultsTextArea.append("Checking instance of a string value \n");
            }
            String tempString = stringMutable.aString;
            //System.out.println(newString);
            result = tempString.substring(1,tempString.length()-1);
        }
        else if (expression instanceof VariableName variableName) {
            if (MainApplication.debugCalled) {
                MainApplication.debugResultsTextArea.append("Checking instance of Variable name \n");
            }
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
            if (MainApplication.debugCalled) {
                MainApplication.debugResultsTextArea.append("Checking instance of Addition \n");
            }

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
            if (MainApplication.debugCalled) {
                MainApplication.debugResultsTextArea.append("Checking instance of Subtraction \n");
            }

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
            if (MainApplication.debugCalled) {
                MainApplication.debugResultsTextArea.append("Checking instance of Multiplication \n");
            }

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
            if (MainApplication.debugCalled) {
                MainApplication.debugResultsTextArea.append("Checking instance of Division \n");
            }

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
            if (MainApplication.debugCalled) {
                MainApplication.debugResultsTextArea.append("Checking instance of Bracketed Expression \n");
            }

            result = getEvaluationResultChild(bracket.middle);
        }
        else if (expression instanceof Exponential exponential) {
            if (MainApplication.debugCalled) {
                MainApplication.debugResultsTextArea.append("Checking instance of Exponential \n");
            }

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
