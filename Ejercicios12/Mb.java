import java.util.Scanner;
/*
 *Alejandro Moreno Garrido
 *conversor de Mb a Kb
 */


public class Mb {
	
  public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Introduzca la cantidad de Mb: ");
	double mb = s.nextDouble();
	
	double total= mb*1000;
	
	System.out.print("El resultado en Kb es: "+total);	
		
	}
}

