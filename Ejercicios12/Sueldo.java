import java.util.Scanner;
/*
 *Alejandro Moreno Garrido
 *
 */


public class Sueldo {
	
  public static void main (String[] args) {
	Scanner s = new Scanner(System.in);	
	System.out.print("Introduzca cuantas horas trabaja");
	double horas = Integer.parseInt(s.nextLine());
	
	double total= horas*12;
	
	System.out.print("Tu sueldo es de: "+total);
	
		
	}
}

