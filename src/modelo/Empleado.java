package modelo;

import java.util.Objects;

public class Empleado extends Persona {
    private int edad;
    
    public Empleado(String nombre, String apellido, int edad) {
        super(nombre, apellido);
        
        if(edad <= 0) {
            throw new IllegalArgumentException("Edad debe ser positiva");
        }
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        if (!super.equals(o)) return false;
        Empleado empleado = (Empleado) o;
        return edad == empleado.edad;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), edad);
    }
}