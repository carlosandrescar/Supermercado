package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Supermercado {
	private String nombre;
	private List<Empleado> empleados = new ArrayList<>();
	
	
	public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados); 
	}
	public List<Empleado> getEmpleadosMenores() {
	    return empleados.stream()
	            .filter(empleado -> empleado.getEdad() < 18)
	            .collect(Collectors.toList());
	}

	public Supermercado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    public int getCantidadEmpleados() {
        return empleados.size();
    }

}
