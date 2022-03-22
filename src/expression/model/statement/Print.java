package expression.model.statement;

import expression.Expression;

import java.util.List;

public class Print extends Expression {
    public String command;
    public List<Expression> thingsToPrint;

    public Print(String command, List<Expression> thingsToPrint) {
        this.command = command;
        this.thingsToPrint = thingsToPrint;
    }

    @Override
    public String toString() {
        return command + " " + thingsToPrint.toString();
    }
}
