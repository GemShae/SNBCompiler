package expression.model.mutable;

import expression.Expression;

public class StringMutable extends Expression {
    public String aString;

    public StringMutable(String aString) {
        this.aString = aString;
    }

    @Override
    public String toString() {
        return new StringMutable(aString).toString();
    }
}
