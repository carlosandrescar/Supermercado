package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import modelo.Supermercado;
import modelo.Empleado;

class SupermercadoTest {
    
    private Supermercado supermercado;
    
    @BeforeEach
    void setUp() {
        supermercado = new Supermercado("Laureles");
    }
    
    @Test
    @DisplayName("Prueba assertEquals - Nombre supermercado")
    void testNombreSupermercado() {
        assertEquals("Laureles", supermercado.getNombre());
    }
    
    @Test
    @DisplayName("Prueba agregar empleados")
    void testAgregarEmpleados() {
        Empleado emp1 = new Empleado("Luis", "456", 20);
        Empleado emp2 = new Empleado("Ana", "789", 25);
        
        supermercado.agregarEmpleado(emp1);
        supermercado.agregarEmpleado(emp2);
        
        assertTrue(supermercado.getEmpleados().contains(emp1));
        assertTrue(supermercado.getEmpleados().contains(emp2));
        assertEquals(2, supermercado.getEmpleados().size());
    }
    
    @Test
    @DisplayName("Prueba empleados menores")
    void testEmpleadosMenores() {
        supermercado.agregarEmpleado(new Empleado("Juan", "123", 17));
        supermercado.agregarEmpleado(new Empleado("Maria", "456", 22));
        supermercado.agregarEmpleado(new Empleado("Carlos", "789", 15));
        
        assertEquals(2, supermercado.getEmpleadosMenores().size());
    }
}