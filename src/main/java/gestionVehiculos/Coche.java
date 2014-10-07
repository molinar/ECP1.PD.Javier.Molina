package gestionVehiculos;

public class Coche extends Vehiculo {

    private Categoria categoria;

    public Coche(int id, String descripcion, double precio, Categoria categoria) {
        super(id, descripcion, precio);
        this.categoria = categoria;
    }

    @Override
    public int getPrecio() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public Categoria getCategoria(){
        return categoria;
    }

}
