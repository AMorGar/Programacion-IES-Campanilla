import java.util.Scanner;
/*Alandro Moreno Garrido
*Recorrido
*
*/

import java.util.Scanner;

public class Circuito {

  public static void main (String [] args) {
	
	Scanner s = new Scanner(System.in);
		
	System.out.print("Introduce una localidad por pantalla: ");
	String localidad = s.nextLine();
		
	String a = "Malaga";
	String b = "Granada";
	String c = "Murcia";		
	String l1 = "Casabermeja";
	String l2 = "Villanueva del Trabuco";
	String l3 = "Loja";
	String l4 = "Guadix";
	String l5 = "Baza";
	String l6 = "Librilla";
	String l7 = "Elche";
	String l8 = "Villena";
	String l9 = "Masalavés";
	String resultado;
	switch (localidad) {
			
		case "Casabermeja":
			System.out.println("Estas en "+ a +", para llegar a Valencia tienes que :");
			System.out.println("que pasar por las ciudades "+ b +" y "+ c);
			System.out.println("y por "+ l2 +", "+ l3 +", "+ l4 +", "+ l5 +", "+ l6 +", "+ l7 +", "+ l8 +" y "+ l9 +".");
		break;
			
		case "Villanueva del Trabuco":
			System.out.println("Estas en "+ a +", para llegar a Valencia tienes que :");
			System.out.println("que pasar por las ciudades "+ b +" y "+ c);
			System.out.println("y por "+ l3 +", "+ l4 +", "+ l5 +", "+ l6 +", "+ l7 +", "+ l8 +" y "+ l9 +".");			
		break;
			
		case "Loja":
			System.out.println("Estas en "+ a +", para llegar a Valencia tienes que :");
			System.out.println("que pasar por las ciudades "+ b +" y "+ c);
			System.out.println("y por las localidades "+ l4 +", "+ l5 +", "+ l6 +", "+ l7 +", "+ l8 +" y "+ l9 +".");
		break;
			
		case "Guadix":
			System.out.println("Estas en "+ b +", para llegar a Valencia tienes que :");
			System.out.println("que pasar por la ciudad de "+ c);
			System.out.println("y por "+ l5 +", "+ l6 +", "+ l7 +", "+ l8 +" y "+ l9 +".");
		break;
			
		case "Baza":
		    System.out.println("Estas en "+ b +", para llegar a Valencia tienes que :");
			System.out.println("que pasar por la ciudad de "+ c);
			System.out.println("y por  "+ l6 +", "+ l7 +", "+ l8 +" y "+ l9 +".");
		break;
			
		case "Librilla":
			System.out.println("Estas en "+ b +", para llegar a Valencia tienes que :");
			System.out.println("que pasar por la ciudad de "+ c);
			System.out.println("y por  "+ l7 +", "+ l8 +" y "+ l9 +".");
		break;
			
		case "elche":
			System.out.println("Estas en "+ c +", para llegar a Valencia tienes que :");
			System.out.println("que pasar por "+ l8 +" y "+ l9 +".");
		break;
			
		case "villena":
			System.out.println("Estas en "+ c +", para llegar a Valencia tienes que :");
			System.out.println("que pasar por "+ l9 +".");
		break;
			
		case "Masalaves":
			System.out.println("Estas en "+ c +" , estas cerca de Valencia.");
		break;
			
		default:
			System.out.print("No es una localidad válida.");
		}
	}
}
