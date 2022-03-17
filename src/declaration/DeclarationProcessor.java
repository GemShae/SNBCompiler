package declaration;

import declaration.model.expression.Sum;
import declaration.model.mutable.IntegerNumber;
import declaration.model.variable.VariableDeclaration;
import declaration.model.variable.VariableName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeclarationProcessor {
    List<Declaration> declarationList;
    public Map<String, String> values; //Symbol table for storing values of variables

    public DeclarationProcessor(List<Declaration> declarationList) {
        this.declarationList = declarationList;
        values = new HashMap<>();
    }

    public List<String> getEvaluationResult() {
        List<String> evaluations = new ArrayList<>();

        for (Declaration declaration: declarationList) {
            if (declaration instanceof VariableDeclaration) {
                VariableDeclaration variableDeclaration = (VariableDeclaration) declaration;
                values.put(variableDeclaration.variableName,variableDeclaration.value);
            }
            else {
                String input = declaration.toString();
                String result = getEvalResult(declaration);
                evaluations.add(input + "is" + result);
            }
        }

        return evaluations;
    }

    private String getEvalResult(Declaration declaration) {
        String result = " ";

        if (declaration instanceof IntegerNumber) {
            IntegerNumber integerNumber = (IntegerNumber) declaration;
            result = Integer.toString(integerNumber.integer);
        }
        else if (declaration instanceof VariableName) {
            VariableName variableName = (VariableName) declaration;
            result = values.get(variableName.variableName);
        }
        else if (declaration instanceof Sum) {
            Sum add = (Sum) declaration;
            String left = getEvalResult(add.left);
            String right = getEvalResult(add.right);

        }

        return result;
    }
}
