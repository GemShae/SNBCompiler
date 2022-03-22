package expression.model;

public class SymbolTable {
    public String variableNames;
    public String dataType;
    public String values;

    public SymbolTable(String variableNames, String dataType, String values) {
        this.variableNames = variableNames;
        this.dataType = dataType;
        this.values = values;
    }

    public SymbolTable() {
        this.variableNames = "variable";
        this.dataType = "dataType";
        this.values = "values";
    }
}
