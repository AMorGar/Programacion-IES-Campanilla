
/*
*Alejandro Moreno Garrido 
*factura iva
 */

import java.util.Scanner;
public class Factura {
	
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el numero de pesetas: ");
	double pesetas = Integer.parseInt(s.nextLine());

	double sol=pesetas*1.25;
	System.out.println("La solucion es:  " + sol);		
	}
}

