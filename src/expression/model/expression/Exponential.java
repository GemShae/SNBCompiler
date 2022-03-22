package expression.model.expression;

import expression.Expression;

public class Exponential extends Expression {
    public Expression left;
    public Double operator;

    public Exponential(Expression left, Double operator) {
        this.left = left;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return left.toString() + "^" + operator.toString();
    }
}
