package ejercicio01;

public class Hora {
	protected int hora;
	protected int minuto;

	public Hora() {
		super();
	}

	public Hora(int hora, int minuto) {
		super();
		if (hora >= 0 && hora <= 23)
			this.hora = hora;
		if (minuto >= 0 && minuto <= 60)
			this.minuto = minuto;
	}

	public void inc() {
		this.minuto++;
		if (minuto >= 60) {
			minuto = 0;
			hora++;
		}
	}

	public boolean setMinutos(int minutosNuevos) {
		boolean cambiado = false;

		if (minutosNuevos >= 0 && minutosNuevos <= 60) {
			this.minuto = minutosNuevos;
			cambiado = true;
		}
		return cambiado;
	}

	public boolean setHora(int horasNuevas) {
		boolean cambiado = false;

		if (horasNuevas >= 0 && horasNuevas <= 23) {
			this.hora = horasNuevas;
			cambiado = true;
		}
		return cambiado;
	}

	@Override
	public String toString() {
		return hora + ":" + minuto;
	}

}