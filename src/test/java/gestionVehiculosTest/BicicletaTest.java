package gestionVehiculosTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gestionVehiculos.Bicicleta;

public class BicicletaTest {

    private Bicicleta bicicleta;

    @Before
    public void before() {
        bicicleta = new Bicicleta(1, "X");
    }

    @Test
    public void testGetPrecioUnDia() {
        assertEquals(3.0, this.bicicleta.getPrecioDia(1), 10e-2);
    }

    @Test
    public void testGetPrecioDosDias() {
        assertEquals(6.0, this.bicicleta.getPrecioDia(2), 10e-2);
    }

    @Test
    public void testGetPrecioTresDias() {
        assertEquals(8.0, this.bicicleta.getPrecioDia(3), 10e-2);
    }

    @Test
    public void testGetPrecioCuatroDias() {
        assertEquals(10.0, this.bicicleta.getPrecioDia(4), 10e-2);
    }
    
    @Test
    public void testToString() {
        assertEquals("Bicicleta Id: 1 Descripción: X", bicicleta.toString());
    }

}
