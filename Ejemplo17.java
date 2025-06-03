
public class Ejemplo17 {
	
	public static void main(String[] args) {
		
	// Simulaicon de un dado
		
	int i = 1;
	int numDado;
	
	do {
		
		numDado = (int) (Math.random()*6+1);
		System.out.println("Ha salido el número: " + numDado);
		i++;
	
	} while(i <= 6);
	
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
	
