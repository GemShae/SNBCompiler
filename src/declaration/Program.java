package declaration;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Declaration> declarations;

    public Program() {
        this.declarations = new ArrayList<>();
    }

    public void addDeclration(Declaration d) {
        declarations.add(d);
    }
}
