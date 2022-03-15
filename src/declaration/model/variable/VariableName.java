package declaration.model.variable;

import declaration.Declaration;

public class VariableName extends Declaration {
    public String variableName;

    public VariableName(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        return variableName;
    }
}
