/*
*Alejandro Moreno Garrido 
*Pesetas a euros 
 */

import java.util.Scanner;
public class PesetasEuros {
	
  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el numero de pesetas: ");
	int pesetas = Integer.parseInt(s.nextLine());

	double sol=pesetas/160;
	System.out.println("La solucion es:  " + sol);		
	}
}

