package gestionVehiculosTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gestionVehiculos.Bicicleta;

public class BicicletaTest {

    private Bicicleta bicicleta;

    @Before
    public void before() {
        bicicleta = new Bicicleta(1, "X", 3.0);
    }

    @Test
    public void testGetPrecioDia() {
        assertEquals(6, this.bicicleta.getPrecioDia(2));
        assertEquals(3, this.bicicleta.getPrecioDia(1));
        assertEquals(10, this.bicicleta.getPrecioDia(4));

    }

}
