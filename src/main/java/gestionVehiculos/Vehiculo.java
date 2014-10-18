package gestionVehiculos;

public abstract class Vehiculo {

    private final int id;

    private final String descripcion;

    public Vehiculo(final int id, final String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return this.id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public abstract double getPrecioDia(int dias);
    
    public abstract String toString();

}
