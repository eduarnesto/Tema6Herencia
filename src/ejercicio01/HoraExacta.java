package ejercicio01;

/**
 * 
 */
public class HoraExacta extends Hora {
	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (segundo >= 0 && segundo < 60)
			this.segundo = segundo;
	}

	public boolean setSegundos(int segundosNuevos) {
		boolean cambiado = false;

		if (segundosNuevos >= 0 && segundosNuevos <= 60) {
			this.segundo = segundosNuevos;
			cambiado = true;
		}
		return cambiado;
	}

	public void inc() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.inc();
		}
	}

	@Override
	public String toString() {
		String res = "";

		res += super.toString();
		
		if (segundo < 10) {
			res += "0";
		}

		res += ":" + segundo;

		return res;
	}

}
