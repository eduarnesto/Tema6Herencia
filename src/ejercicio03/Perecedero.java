package ejercicio03;

public class Perecedero extends Producto{
	private int diasACaducar;

	public Perecedero() {

	}

	public Perecedero(String nombre, float precio, int diasACaducar) {
		super(nombre, precio);
		if (diasACaducar>=0) {
			this.diasACaducar = diasACaducar;
		}
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}
	
	@Override
	public float calcular(int productos) {
		float res = super.calcular(productos);
		
		switch (diasACaducar) {
		case 1:
			res = res/4;
			break;
		case 2:
			res = res/3;
			break;
		case 3:
			res = res/2;
			break;
		}

		
		return res;
	}
}
