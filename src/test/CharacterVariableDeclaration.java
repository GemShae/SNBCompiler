package test;

import expression.Expression;

public class CharacterVariableDeclaration extends Expression {
    public String dataType;
    public String variableName;
    public char value;

    public CharacterVariableDeclaration(String dataType, String variableName, char value) {
        this.dataType = dataType;
        this.variableName = variableName;
        this.value = value;
    }
}
