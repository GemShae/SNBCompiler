package expression.model.statement;

import expression.Expression;

public class Assignment extends Expression {
    public String variableName;
    public Expression value;

    public Assignment(String variableName, Expression value) {
        this.variableName = variableName;
        this.value = value;
    }
}
