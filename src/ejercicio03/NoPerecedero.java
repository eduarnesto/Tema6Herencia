package ejercicio03;

public class NoPerecedero extends Producto{
	private String tipo;

	public NoPerecedero() {

	}

	public NoPerecedero(String nombre, float precio, String tipo) {
		super(nombre, precio);
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public float calcular(int productos) {
		return super.calcular(productos);
	}
}
