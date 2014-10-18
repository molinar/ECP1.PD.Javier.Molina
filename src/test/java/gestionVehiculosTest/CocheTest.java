package gestionVehiculosTest;

import static org.junit.Assert.assertEquals;
import gestionVehiculos.Categoria;
import gestionVehiculos.Coche;

import org.junit.Before;
import org.junit.Test;

public class CocheTest {
  
    private Coche[] coches;
    
    @Before
    public void before() {
        coches = new Coche[3];
        coches[0] = new Coche(1, "Utilitario", Categoria.A);
        coches[1] = new Coche(2, "Monovolumen", Categoria.B);
        coches[2] = new Coche(3, "Familiar", Categoria.C);
    }

    @Test
    public void testGetPrecioDosDiasA() {
        assertEquals(20.0, this.coches[0].getPrecioDia(2), 10e-2);
    }
    
    @Test
    public void testGetPrecioDosDiasB() {
        assertEquals(30.0, this.coches[1].getPrecioDia(2), 10e-2);
    }
    
    @Test
    public void testGetPrecioDosDiasC() {
        assertEquals(40.0, this.coches[2].getPrecioDia(2), 10e-2);
    }
    
    @Test
    public void testGetPrecioCincoDiasA() {
        assertEquals(46.0, this.coches[0].getPrecioDia(5), 10e-2);
    }
    
    @Test
    public void testGetPrecioCincoDiasB() {
        assertEquals(69.0, this.coches[1].getPrecioDia(5), 10e-2);
    }
    
    @Test
    public void testGetPrecioCincoDiasC() {
        assertEquals(92.0, this.coches[2].getPrecioDia(5), 10e-2);
    }
    
    @Test
    public void testGetPrecioNueveDiasA() {
        assertEquals(72.0, this.coches[0].getPrecioDia(9), 10e-2);
    }
    
    @Test
    public void testGetPrecioNueveDiasB() {
        assertEquals(108.0, this.coches[1].getPrecioDia(9), 10e-2);
    }
    
    @Test
    public void testGetPrecioNueveDiasC() {
        assertEquals(144.0, this.coches[2].getPrecioDia(9), 10e-2);
    }


    @Test
    public void testToString() {
        assertEquals("Coche Id: 1 Categoría: A Descripción: Utilitario", coches[0].toString());
        assertEquals("Coche Id: 2 Categoría: B Descripción: Monovolumen", coches[1].toString());
        assertEquals("Coche Id: 3 Categoría: C Descripción: Familiar", coches[2].toString());
    }
}
