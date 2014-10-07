package gestionVehiculos;

public class Coche extends Vehiculo {

    private Categoria categoria;

    public Coche(int id, String descripcion, double precio, Categoria categoria) {
        super(id, descripcion, precio);
        this.categoria = categoria;
    }

    @Override
    public int mostrarPrecio() {
        // TODO Auto-generated method stub
        return 0;
    }

}
