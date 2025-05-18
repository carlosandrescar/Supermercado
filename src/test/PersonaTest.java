package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import modelo.Persona;

class PersonaTest {
    
    @Test
    @DisplayName("Prueba creación persona")
    void testCreacionPersona() {
        Persona persona = new Persona("Maria", "Gomez");
        
        assertEquals("Maria", persona.getNombre());
        assertEquals("Gomez", persona.getApellido());
    }
    
    @Test
    @DisplayName("Prueba datos vacíos persona")
    void testDatosVacios() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Persona("", "Gomez");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            new Persona("Maria", null);
        });
    }
}