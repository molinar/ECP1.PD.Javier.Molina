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
        assertEquals(3, this.bicicleta.getPrecioDia(1));
    }

    @Test
    public void testGetPrecioDosDias() {
        assertEquals(6, this.bicicleta.getPrecioDia(2));
    }

    @Test
    public void testGetPrecioTresDias() {
        assertEquals(8, this.bicicleta.getPrecioDia(3));
    }

    @Test
    public void testGetPrecioCuatroDias() {
        assertEquals(10, this.bicicleta.getPrecioDia(4));
    }

}
