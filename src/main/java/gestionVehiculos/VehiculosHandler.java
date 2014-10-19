package gestionVehiculos;

import java.util.HashMap;

public class VehiculosHandler {

    private HashMap<Integer, Vehiculo> vehiculos;
    
    public VehiculosHandler(){
        this.vehiculos = new HashMap<Integer, Vehiculo>();
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.put(vehiculo.getId(), vehiculo);
    }

    public String mostrarVehiculos() {
        return vehiculos.toString();
    }

    public Vehiculo recuperarVehiculo(int id) {
        assert vehiculos.get(id) != null : "No existe vehiculo"; 
        return vehiculos.get(id);
    }

}
