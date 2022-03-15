package declaration.model.variable;

import declaration.Declaration;

public class VariableDeclaration extends Declaration {
    public String define;
    public String dataType;
    public String variableName;
    public String value;

    public VariableDeclaration(String define, String dataType, String variableName, String value) {
        this.define = define;
        this.dataType = dataType;
        this.variableName = variableName;
        this.value = value;
    }
}
