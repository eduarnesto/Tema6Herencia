package ejercicio02;

public class Tecnico extends Operario{
	public Tecnico() {

	}

	public Tecnico(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String res = super.toString();
		
		res += " -> Tecnico";
		
		return res;
	}
}
