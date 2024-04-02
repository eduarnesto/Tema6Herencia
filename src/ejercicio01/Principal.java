package ejercicio01;

import java.util.Scanner;

public class Principal {

	// Scanner para leer del teclado
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para guardar la opcion elegida
		int opc;

		do {
			// Muestro el menu
			menu();

			// Leo del teclado
			opc = sc.nextInt();

			switch (opc) {
			case 1: {
				caso1();
				break;
			}
			case 2: {
				caso2();
				break;
			}
			case 3: {
				System.out.println("Saliendo del programa...");
				break;
			}
			default:
				System.out.println("Opcion elegida no valida");
				break;
			}

		} while (opc != 3);

	}

	public static void menu() {
		System.out.println("Seleccione la opcion que quiere realizar");
		System.out.println("1.- Crear hora");
		System.out.println("2.- Crear hora exacta");
		System.out.println("3.- Salir");
	}

	public static void menuHora() {
		System.out.println("Seleccione la opcion que quiere realizar");
		System.out.println("1.- Incrementar la hora en un minuto");
		System.out.println("2.- Cambiar los minutos");
		System.out.println("3.- Cambiar la hora");
		System.out.println("4.- Mostrar la hora");
		System.out.println("5.- Salir");
	}

	public static void menuHoraExacta() {
		System.out.println("Seleccione la opcion que quiere realizar");
		System.out.println("1.- Incrementar la hora en un segundo");
		System.out.println("2.- Cambiar los segundos");
		System.out.println("3.- Mostrar la hora");
		System.out.println("4.- Salir");
	}

	public static int preguntaHora() {
		int hora;

		System.out.println("Introduzca la hora");
		hora = sc.nextInt();

		return hora;
	}

	public static int preguntaMinuto() {
		int minuto;

		System.out.println("Introduzca los minutos");
		minuto = sc.nextInt();

		return minuto;
	}

	public static int preguntaSegundo() {
		int segundo;

		System.out.println("Introduzca los segundos");
		segundo = sc.nextInt();

		return segundo;
	}
	
	public static void caso1() {
		// Objeto hora
		Hora hora;
		
		// Variable para guardar la opcion elegida
		int opc;

		// Variable para guardar la hora
		int horas;

		// Variable para guardar los minutos+
		int minuto;

		// Pregunto por la hora
		horas = preguntaHora();

		// Pregunto los minutos
		minuto = preguntaMinuto();

		// Creo la hora
		hora = new Hora(horas, minuto);
		
		do {
			//Muestro el menu
			menuHora();
			
			//Leo del teclado
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: {
				hora.inc();
				break;
			}
			case 2: {
				minuto = preguntaMinuto();
				if (hora.setMinutos(minuto)) {
					System.out.println("Se han modificado los minutos");
				} else {
					System.out.println("No se ha podido modificar");
				}
				break;
			}
			case 3: {
				horas = preguntaHora();
				if (hora.setHora(horas)) {
					System.out.println("Se ha modificado la hora");
				} else {
					System.out.println("No se ha podido modificar");
				}
				break;
			}
			case 4: {
				System.out.println(hora);
				break;
			}
			case 5: {
				System.out.println("Saliendo al menu...");
				break;
			}
			default:
				System.out.println("Opcion elegida no valida");
				break;
			}
			
		} while (opc!=5);

	}

	public static void caso2() {
		// Objeto hora
		HoraExacta hora;
		
		// Variable para guardar la opcion elegida
		int opc;

		// Variable para guardar la hora
		int horas;

		// Variable para guardar los minutos
		int minuto;
		
		// Variable para guardar los segundos
		int segundo;

		// Pregunto por la hora
		horas = preguntaHora();

		// Pregunto los minutos
		minuto = preguntaMinuto();
		
		//Pregunto los segundos
		segundo = preguntaSegundo();

		// Creo la hora
		hora = new HoraExacta(horas, minuto, segundo);
		
		do {
			//Muestro el menu
			menuHoraExacta();
			
			//Leo del teclado
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: {
				hora.inc();
				break;
			}
			case 2: {
				segundo = preguntaSegundo();
				if (hora.setSegundos(segundo)) {
					System.out.println("Se han modificado los segundos");
				} else {
					System.out.println("No se ha podido modificar");
				}
				break;
			}
			case 3: {
				System.out.println(hora);
				break;
			}
			case 4: {
				System.out.println("Saliendo al menu...");
				break;
			}
			default:
				System.out.println("Opcion elegida no valida");
				break;
			}
			
		} while (opc!=4);

	}
	
}