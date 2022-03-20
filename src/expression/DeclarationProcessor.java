package expression;

import expression.model.expression.Addition;
import expression.model.mutable.IntegerNumber;
import expression.model.variable.IntegerVariableDeclaration;
import expression.model.mutable.VariableName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeclarationProcessor {
    List<Expression> expressionList;
    public Map<String, String> values; //Symbol table for storing values of variables

    public DeclarationProcessor(List<Expression> expressionList) {
        this.expressionList = expressionList;
        values = new HashMap<>();
    }

    public List<String> getEvaluationResult() {
        List<String> evaluations = new ArrayList<>();

        for (Expression expression : expressionList) {
            if (expression instanceof IntegerVariableDeclaration) {
                IntegerVariableDeclaration variableDeclaration = (IntegerVariableDeclaration) expression;
                //values.put(variableDeclaration.variableName,variableDeclaration.value);
            }
            else {
                String input = expression.toString();
                String result = getEvalResult(expression);
                evaluations.add(input + "is" + result);
            }
        }

        return evaluations;
    }

    private String getEvalResult(Expression expression) {
        String result = " ";

        if (expression instanceof IntegerNumber) {
            IntegerNumber integerNumber = (IntegerNumber) expression;
            result = Integer.toString(integerNumber.integer);
        }
        else if (expression instanceof VariableName) {
            VariableName variableName = (VariableName) expression;
            result = values.get(variableName.variableName);
        }
        else if (expression instanceof Addition) {
            Addition add = (Addition) expression;
            String left = getEvalResult(add.left);
            String right = getEvalResult(add.right);

        }

        return result;
    }
}
