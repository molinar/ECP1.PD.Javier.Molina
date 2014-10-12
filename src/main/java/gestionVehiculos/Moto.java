package gestionVehiculos;

public class Moto extends Vehiculo {
    
    public static final int PRECIO = 8;
    public static final int PRECIO_DESCUENTO = 7;
    public static final int DIAS_DESCUENTO = 7;

    public Moto(int id, String descripcion) {
        super(id, descripcion);
    }

    @Override
    public double getPrecioDia(int dias) {
        double total = 0.0;
        for(int i = 0; i < dias; i++){
            if (i < DIAS_DESCUENTO){
                total =+ Moto.PRECIO;
            }else if(i >= DIAS_DESCUENTO){
                total =+ Moto.PRECIO_DESCUENTO;    
            }
        }
        return total;
    }

}
