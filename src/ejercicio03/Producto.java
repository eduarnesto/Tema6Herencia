package ejercicio03;

public class Producto {
	protected String nombre = "";
	protected float precio;

	public Producto() {

	}

	public Producto(String nombre, float precio) {
		super();
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		if (precio >= 0)
			this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		if (precio >= 0)
			this.precio = precio;
	}

	public float calcular(int productos) {
		float res = 0;

		if (productos > 0)
			res = this.precio * productos;

		return res;
	}
}
