package expression.model.variable;

import expression.Expression;

public class BooleanVariableDeclaration extends Expression {
    public String dataType;
    public String variableName;
    public boolean value;

    public BooleanVariableDeclaration(String dataType, String variableName, boolean value) {
        this.dataType = dataType;
        this.variableName = variableName;
        this.value = value;
    }
}
