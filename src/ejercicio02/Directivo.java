package ejercicio02;

public class Directivo extends Empleado{
	public Directivo() {

	}

	public Directivo(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String res = super.toString();
		
		res += " -> Directivo";
		
		return res;
	}
}
