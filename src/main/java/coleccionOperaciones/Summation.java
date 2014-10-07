package coleccionOperaciones;

public class Summation extends Operation {

    public Summation(int operator1, int operator2) {
        super(operator1, operator2);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "[" + getOperator1() + "+" + getOperator2() + "]";
    }

    @Override
    public int operar() {
        return this.getOperator1() + this.getOperator2();
    }

}
