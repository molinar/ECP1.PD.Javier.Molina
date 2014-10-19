package gestionVehiculos;

import upm.jbb.IO;

public class VehiculosMain {
    
    public static void main(String[] args) {
        Controller controlador = new Controller();
        IO.out.addController(controlador);
    }
}
