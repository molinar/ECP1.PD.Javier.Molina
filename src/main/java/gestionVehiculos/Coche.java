package gestionVehiculos;

public class Coche extends Vehiculo {

    private Categoria categoria;

    public static final double PRIMER_DESCUENTO = 0.8;

    public static final double SEGUNDO_DESCUENTO = 0.5;

    public static final int DIAS_PRIMER_DESCUENTO = 3;

    public static final int DIAS_SEGUNDO_DESCUENTO = 7;

    public Coche(int id, String descripcion, Categoria categoria) {
        super(id, descripcion);
        this.categoria = categoria;
    }

    @Override
    public double getPrecioDia(int dias) {
        double total = 0.0;
        if (dias > 0) {
            for (int i = 0; i < dias; i++) {
                if (i < DIAS_PRIMER_DESCUENTO) {
                    total += this.categoria.precio;
                } else if (i >= DIAS_PRIMER_DESCUENTO && i < DIAS_SEGUNDO_DESCUENTO) {
                    total += this.categoria.precio * PRIMER_DESCUENTO;
                } else if (i >= DIAS_SEGUNDO_DESCUENTO) {
                    total += this.categoria.precio * SEGUNDO_DESCUENTO;
                }
            }
        }else{
            assert false: "días tiene que tener un valor positivo";
        }
        return total;
    }

    @Override
    public String toString() {
        return "Coche Id: " + this.getId() + " Categoría: " + this.categoria + " Descripción: " + this.getDescripcion();
    }
}
