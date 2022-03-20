package expression.model.variable;

import expression.Expression;

public class FloatVariableDeclaration extends Expression {
    public String dataType;
    public String variableName;
    public float value;

    public FloatVariableDeclaration(String dataType, String variableName, float value) {
        this.dataType = dataType;
        this.variableName = variableName;
        this.value = value;
    }
}
