package test;

import expression.Expression;

public class CharacterChar extends Expression {
    public char character;

    public CharacterChar(char character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return new CharacterChar(character).toString();
    }
}
