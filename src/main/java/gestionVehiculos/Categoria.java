package gestionVehiculos;

public enum Categoria {
    A('A', 10), B('B', 15), C('C', 20);

    public char categoria;

    public int precio;

    Categoria(char categoria, int precio) {
        this.categoria = categoria;
        this.precio = precio;

    }
}
