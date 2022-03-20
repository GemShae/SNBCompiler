package expression.model.mutable;

import expression.Expression;

public class IntegerNumber extends Expression {
    public int integer;

    public IntegerNumber(int integerNum) {
        this.integer = integerNum;
    }

    @Override
    public String toString() {
        return new IntegerNumber(integer).toString();
    }
}
