
public class Ejemplo17 {

	public static void main(String[] args) {

		// Simulación de un dado.
////		
////		System.out.println("Números entre 1 y 6");
////		
////		int numAleatorio;
////		int i = 1;
////		while(i<=10) {
////			numAleatorio = (int)(6*Math.random() + 1);
////			System.out.println(numAleatorio);
////			i++;
//	
////		}
		
		System.out.println(TirarDosDados());
		
		
	}
	
	public static String TirarDosDados() {
		
		int dado1 = (int) (6*Math.random() +1);
		int dado2 = (int) (6*Math.random() +1);;
		int suma = dado1 + dado2;
		
		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		
		return  "\nLa suma del dado 1 y 2 es: " + suma;
		
		
		
	}

}

