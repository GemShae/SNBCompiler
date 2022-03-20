package expression.model.variable;

import expression.Expression;

public class StringVariableDeclaration extends Expression {
    public String dataType;
    public String variableName;
    public String value;

    public StringVariableDeclaration(String dataType, String variableName, String value) {
        this.dataType = dataType;
        this.variableName = variableName;
        this.value = value;
    }
}
