package coleccionOperaciones;

public class Multiplication extends Operation {

    public Multiplication(int operator1, int operator2) {
        super(operator1, operator2);
    }

    @Override
    public String toString() {
        return "[" + getOperator1() + "*" + getOperator2() + "]";
    }

    @Override
    public int operar() {
        return this.getOperator1() * this.getOperator2();
    }

}
