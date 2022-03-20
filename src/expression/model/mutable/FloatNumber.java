package expression.model.mutable;

import expression.Expression;

public class FloatNumber extends Expression {
    public Float floatNumber;

    public FloatNumber(Float floatNumber) {
        this.floatNumber = floatNumber;
    }

    @Override
    public String toString() {
        return new FloatNumber(floatNumber).toString();
    }
}
