package coleccionOperaciones;

import java.util.ArrayList;

public class OperationsCollection {

    private ArrayList<Operation> arrayOperaciones = new ArrayList<Operation>();

    public void add(Operation operator) {
        this.arrayOperaciones.add(operator);
    }

    public void reset() {
        this.arrayOperaciones.clear();
    }

    public int total() {
        int result = 0;
        for (Operation operation : arrayOperaciones) {
            result = result + operation.operar();
        }
        System.out.print(">>> ");
        return result;
    }
}
