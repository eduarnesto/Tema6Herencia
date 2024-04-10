package ejercicio05;

public abstract class Poligono {
	protected int numeroLados;

	public Poligono(int numeroLados) {
		super();
		if (numeroLados > 0) {
			this.numeroLados = numeroLados;
		}
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	abstract double area();

	public String toString() {
		String res = "Número de lados: ";
		res += numeroLados + "\n";
		return res;
	}

}