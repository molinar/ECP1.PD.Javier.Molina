package gestionVehiculos;

public class Bicicleta extends Vehiculo {

    public static final int PRECIO = 3;

    public static final int PRECIO_DESCUENTO = 2;

    public static final int DIAS_DESCUENTO = 2;

    public Bicicleta(int id, String descripcion) {
        super(id, descripcion);
    }

    @Override
    public double getPrecioDia(int dias) {
        double total = 0.0;
        for (int i = 0; i < dias; i++) {
            if (i < DIAS_DESCUENTO) {
                total = +Bicicleta.PRECIO;
            } else if (i >= DIAS_DESCUENTO) {
                total = +Bicicleta.PRECIO_DESCUENTO;
            }
        }
        return total;
    }

}
