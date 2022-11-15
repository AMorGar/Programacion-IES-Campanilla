import java.util.Scanner;
/*
 *Alejandro Moreno Garrido
 *conversor de Kb a Mb
 */


public class Kb {
	
  public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Introduzca la cantidad de Kb: ");
	double kb = s.nextDouble();
	
	double total= kb/1000;
	
	System.out.print("El resultado en Mb es: "+total);	
		
	}
}
