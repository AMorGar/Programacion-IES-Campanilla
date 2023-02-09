
import misFunciones.Varios;
import java.util.Scanner;
/*
Alejandro moreno garrido
 */


public class Ejercicio14 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la altura: ");
    int x =s.nextInt(); 
    System.out.print("Introduce el signo: ");
    String y =s.nextLine(); 
    
		misFunciones.Varios.piramide(x,y);
    
    
	}
}

