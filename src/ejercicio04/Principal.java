package ejercicio04;

public class Principal {
	public static void main(String[] args) {
		// Variable para guardar la suma de todos los eletcrodomesticos
		double sumaE = 0;
		
		// Variable para guardar la suma de las lavadoras
		double sumaL = 0;
		
		// Variable para guardar la suma de los televisores
		double sumaT = 0;

		// Creación de los electrodomesticos
		Electrodomestico e1 = new Electrodomestico(150, "blanco", 'A', 2);
		Electrodomestico e2 = new Television(100, 15);
		Electrodomestico e3 = new Television(250, "AZUL", 'B', 20, 24, true);
		Electrodomestico e4 = new Lavadora(230, 67);
		Electrodomestico e5 = new Electrodomestico();


		// Guardo los electrodomesticos en un array
		Electrodomestico elec[] = { e1, e2, e3, e4, e5};

		// Imprimo los elementos del array
		for (Electrodomestico obj : elec) {
			System.out.println(obj);
			System.out.println("------------------- \n");
		}
		// Imprimo el precio final de cada elemento
		System.out.println("------Precio Final------");
		for (int i = 0; i < elec.length; i++) {
			System.out.println("Electrodomestico + " + (i + 1));
			elec[i].precioFinal();
			System.out.println(elec[i].precioBase);
		}
		// Calculo la suma de los electrodomésticos según su tipo
		for (int i = 0; i < elec.length; i++) {

			if (elec[i] instanceof Electrodomestico) {
				sumaE += elec[i].precioBase;
			}
			if (elec[i] instanceof Lavadora) {
				sumaL += elec[i].precioBase;
			}
			if (elec[i] instanceof Television) {
				sumaT += elec[i].precioBase;
			}
		}
		// Muestro la suma de cada tipo
		System.out.println("------Total------");
		System.out.println("Suma de los Electrodomesticos: " + sumaE);
		System.out.println("Suma de los Lavadoras: " + sumaL);
		System.out.println("Suma de los Televisiones: " + sumaT);
	}
}
