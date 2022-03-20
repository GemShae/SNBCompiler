package expression.model.mutable;

import expression.Expression;

public class VariableName extends Expression {
    public String variableName;

    public VariableName(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        return variableName;
    }
}
