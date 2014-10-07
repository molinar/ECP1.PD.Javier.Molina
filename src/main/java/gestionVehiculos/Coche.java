package gestionVehiculos;

public class Coche extends Vehiculo {

    private Categoria categoria;

    public Coche(int id, String descripcion, Categoria categoria) {
        super(id, descripcion);
        this.categoria = categoria;
    }

    @Override
    public int getPrecioDia(int dias) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public Categoria getCategoria(){
        return categoria;
    }

}
