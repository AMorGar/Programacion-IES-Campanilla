import java.util.Scanner;
/*
 *Alejandro Moreno Garrido
 * Volumen cono segun la formula
 */


public class VolumenCono {
	
  public static void main (String[] args) {
		
	Scanner s = new Scanner(System.in);	
	System.out.print("Introduzca la altura");
	double h = Integer.parseInt(s.nextLine());
	System.out.print("Introduzca el radio");
	double r = Integer.parseInt(s.nextLine());
	double Pi= 3.14;
	
	double total= 0.33*Pi*(r*r)*h;
	System.out.printf("El volumen es: "+total);	
	}
}

