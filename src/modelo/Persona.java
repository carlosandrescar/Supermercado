package modelo;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellido;
    
    public Persona(String nombre, String apellido) {
        if(nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre no puede estar vacío");
        }
        if(apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("Apellido no puede estar vacío");
        }
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && 
               Objects.equals(apellido, persona.apellido);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}