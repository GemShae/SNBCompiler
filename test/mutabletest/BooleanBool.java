package test.mutable;

import expression.Expression;

public class BooleanBool extends Expression {
    public boolean aBoolean;

    public BooleanBool(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    @Override
    public String toString() {
        return new BooleanBool(aBoolean).toString();
    }
}
