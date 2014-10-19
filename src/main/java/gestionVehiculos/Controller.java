package gestionVehiculos;

import upm.jbb.IO;

public class Controller {
    
    private VehiculosHandler vehiculosHandler = new VehiculosHandler();
    
    public void darAltaCoche(){
        this.vehiculosHandler.addVehiculo((Vehiculo) IO.in.read(Coche.class, "Introduzca los datos de un coche: "));
    }
    
    public void darAltaMoto(){
        this.vehiculosHandler.addVehiculo((Vehiculo) IO.in.read(Moto.class, "Introduzca los datos de un coche: "));
    }
    
    public void darAltaBicicleta(){
        this.vehiculosHandler.addVehiculo((Vehiculo) IO.in.read(Bicicleta.class, "Introduzca los datos de un coche: "));
    }
    
    public void mostrarVehiculos(){
        IO.out.println(this.vehiculosHandler.mostrarVehiculos());
    }
    
    public void obtenerPrecio(){
        
        IO.out.println(this.vehiculosHandler.recuperarVehiculo(IO.in.readInt("Introduzca Id: ")).getPrecioDia(IO.in.readInt("Introduzca días de alquiler: ")));
    }

}
