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
    
    
    
    public static int tirard20() {
    	int d20 = (int) (Math.random()*20+1);
    	
    	return d20;
    }
}

