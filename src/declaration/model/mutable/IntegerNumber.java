package declaration.model.mutable;

import declaration.Declaration;

public class IntegerNumber extends Declaration {
    public int integer;

    public IntegerNumber(int integerNum) {
        this.integer = integerNum;
    }

    @Override
    public String toString() {
        return new IntegerNumber(integer).toString();
    }
}
