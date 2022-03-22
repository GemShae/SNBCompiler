package NotUsing;

import expression.Expression;

public class IntegerVariableDeclaration extends Expression {
    public String dataType;
    public String variableName;
    public int value;

    public IntegerVariableDeclaration(String dataType, String variableName, int value) {
        this.dataType = dataType;
        this.variableName = variableName;
        this.value = value;
    }
}
