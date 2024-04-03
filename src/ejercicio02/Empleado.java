package ejercicio02;

public class Empleado {
	private String nombre;

	public Empleado() {

	}

	public Empleado(String nombre) {
		super();
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}

	
}
