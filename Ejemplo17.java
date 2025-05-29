
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

}
