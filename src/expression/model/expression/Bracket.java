package expression.model.expression;

import expression.Expression;

public class Bracket extends Expression{
    public Expression middle;

    public Bracket(Expression middle) {
        this.middle = middle;
    }

    @Override
    public String toString() {
        return "(" + middle.toString() + ")";
    }
}
