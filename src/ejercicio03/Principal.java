package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		Producto pro = new Producto("Zanahoria", 45);
		Perecedero pere = new Perecedero("Campana", 20, 3);
		NoPerecedero nopere = new NoPerecedero("Pera", 45, "Fruta");
		
		System.out.println(pro.calcular(2));
		System.out.println(pere.calcular(2));
		System.out.println(nopere.calcular(1));
	}

}
