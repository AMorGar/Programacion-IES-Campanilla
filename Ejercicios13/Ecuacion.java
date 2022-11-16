import java.util.Scanner;
/*
 *Alejandro Moreno Garrido
 * Ecuacion
 */


public class Ecuacion {
	
  public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Introduzca el valor de a: ");
	double a = s.nextDouble();
	System.out.print("Introduzca el valor de b: ");
	double b = s.nextDouble();
	
	if (a==0){
	  System.out.print("No tiene solucion ");
	}else {
	  double total= b/a;
	  System.out.print("X= "+total);
	  
	}
		
	
	
	
	
	}
}

