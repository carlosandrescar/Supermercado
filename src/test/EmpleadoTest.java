package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import modelo.Empleado;

class EmpleadoTest {
    
    @Test
    @DisplayName("Prueba creación empleado válido")
    void testCreacionValida() {
        Empleado empleado = new Empleado("Juan", "Perez", 25);
        
        assertEquals("Juan", empleado.getNombre());
        assertEquals("Perez", empleado.getApellido());
        assertEquals(25, empleado.getEdad());
    }
    
    @Test
    @DisplayName("Prueba assertThrows - Datos vacíos")
    void testDatosVacios() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("", "Perez", 25);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("Juan", " ", 25);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("Juan", "Perez", 0);
        });
    }
    
    @Test
    @DisplayName("Prueba equals y hashCode")
    void testEqualsHashCode() {
        Empleado emp1 = new Empleado("Juan", "Perez", 25);
        Empleado emp2 = new Empleado("Juan", "Perez", 25);
        
        assertEquals(emp1, emp2);
        assertEquals(emp1.hashCode(), emp2.hashCode());
    }
}