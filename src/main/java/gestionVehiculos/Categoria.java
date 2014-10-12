package gestionVehiculos;

public enum Categoria {
    A(10), B(15), C(20);

    public int precio;

    Categoria(int precio) {
        this.precio = precio;

    }
}
