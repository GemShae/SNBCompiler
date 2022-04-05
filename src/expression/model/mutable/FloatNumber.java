package expression.model.mutable;

import expression.Expression;

public class FloatNumber extends Expression {
    public float floatNumber;

    public FloatNumber(float floatNumber) {
        this.floatNumber = floatNumber;
    }

    @Override
    public String toString() {
        return new FloatNumber(floatNumber).toString();
        //return String.valueOf(new FloatNumber(floatNumber));
    }
}
