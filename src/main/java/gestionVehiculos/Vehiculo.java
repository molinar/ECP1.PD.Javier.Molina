package gestionVehiculos;

public abstract class Vehiculo {
    
    private final int id;
    private final String descripcion;
    private final double precio;

    public Vehiculo(final int id, final String descripcion, final double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public abstract int mostrarPrecio();
}
