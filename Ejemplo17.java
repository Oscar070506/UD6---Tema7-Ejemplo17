
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
	public static boolean dadoExtra(){
		int dado1 = (int) (Math.random()*6);
		int dado2 = (int) (Math.random()*6);

		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		
		if(dado1 == dado2){
			System.out.println("Como las tiradas de ambos dados han sido iguales, se tira un tercero: ");
			int dado3 = (int) (Math.random()*6);
			System.out.println("Dado 3: " + dado3);
			return true;
		}

		System.out.println("Las tiradas no han sido iguales.");
		return false;
	}		
}

public static int tirard20() {
    	int d20 = (int) (Math.random()*20+1);

    	return d20;
    }
}

