package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static Scanner sc = new Scanner(System.in);
	public static Poligono[] poligonos = new Poligono[10];
	
	public static void main(String[] args) {
		

		int opc = 0;

		double lado1;
		double lado2;
		double lado3;

		while (opc != 4) {
			menu();
			opc = sc.nextInt();
			switch (opc) {
			case 1 -> {
				anyadirRectangulo();
			}
			case 2 -> {
				System.out.println("Introduzca los lados: ");
				lado1 = sc.nextDouble();
				lado2 = sc.nextDouble();
				lado3 = sc.nextDouble();
				Poligono tri = new Triangulo(lado1, lado2, lado3);
				anyadirPoligono(tri);
			}
			case 3 -> {
				for (Poligono polig : poligonos) {
					System.out.println(polig);
				}
			}
			case 4 -> {
				System.out.println("Saliendo...");
			}
			default -> {
				System.out.println("Valor no comprendido");
			}
			}
		}

	}

	public static void anyadirRectangulo() {
		double lado1;
		double lado2;
		System.out.println("Introduzca el ancho: ");
		lado1 = sc.nextDouble();
		
		System.out.println("Introduzca el alto");
		lado2 = sc.nextDouble();
		
		Poligono rec = new Rectangulo(lado1, lado2);
		
		anyadirPoligono(rec);
	}

	static void menu() {
		System.out.println("Elige una de las siguientes opciones:");
		System.out.println("1. Introducir un rectangulo");
		System.out.println("2. Introducir un triangulo");
		System.out.println("3. Listar el contenido del array");
		System.out.println("4. Salir");
	}

	public static int posicionLibre() {
		int pos = -1;
		int i = 0;

		while (i < poligonos.length && pos == -1) {
			if (poligonos[i] == null) {
				pos = i;
			}
			i++;
		}
		return pos;
	}

	public static void listado() {
		for (Poligono poligono : poligonos) {
			if (poligono != null) {
				System.out.println(poligono);
			}
		}
	}

	public static boolean anyadirPoligono(Poligono poligon) {
		boolean anyadido = false;
		int posLibre = posicionLibre();
		if (posLibre != -1) {
			poligonos[posLibre] = poligon;
			anyadido = true;
		}

		return anyadido;

	}

}
