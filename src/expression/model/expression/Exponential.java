package expression.model.expression;

import expression.Expression;

public class Exponential extends Expression {
    public Expression left;
    public Float operator;

    public Exponential(Expression left, Float operator) {
        this.left = left;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return left.toString() + "^" + operator.toString();
    }
}
