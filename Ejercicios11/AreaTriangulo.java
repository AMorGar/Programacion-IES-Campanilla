/*
Alejandro Moreno Garrido
* Area Triangulo
 */

import java.util.Scanner;
public class AreaTriangulo {

  public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el primer numero: ");
	int n2 = Integer.parseInt(s.nextLine());
	System.out.print("Introduce el segundo numero: ");
	int n1 = Integer.parseInt(s.nextLine());

	double sol=(n1*n2)/2;
	System.out.println("El area es:  " + sol);
	}
}

