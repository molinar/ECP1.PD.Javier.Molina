package gestionVehiculosTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gestionVehiculos.Moto;

public class MotoTest {
    private Moto moto;

    @Before
    public void before() {
        moto = new Moto(1, "X");
    }

    @Test
    public void testGetPrecioUnDia() {
        assertEquals(8.0, this.moto.getPrecioDia(1), 10e-2);
    }

    @Test
    public void testGetPrecioSeisDias() {
        assertEquals(48.0, this.moto.getPrecioDia(6), 10e-2);
    }

    @Test
    public void testGetPrecioSieteDias() {
        assertEquals(56.0, this.moto.getPrecioDia(7), 10e-2);
    }

    @Test
    public void testGetPrecioOchoDias() {
        assertEquals(63.0, this.moto.getPrecioDia(8), 10e-2);
    }

    @Test
    public void testGetPrecioDiezDias() {
        assertEquals(77.0, this.moto.getPrecioDia(10), 10e-2);
    }

    @Test
    public void testToString() {
        assertEquals("Moto Id: 1 Descripción: X", moto.toString());
    }

}
