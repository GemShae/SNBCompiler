package declaration.model.expression;

import declaration.Declaration;

public class Sum extends Declaration {
    public Declaration left;
    public Declaration right;
    public String symbol;

    public Sum(Declaration left, String symbol, Declaration right) {
        this.left = left;
        this.symbol = symbol;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + symbol + right.toString();
    }
}
