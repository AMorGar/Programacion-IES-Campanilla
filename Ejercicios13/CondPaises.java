/*
 *Alejandro Moreno Garrido
 *Paises y lenguaje oficial
 */

import java.util.Scanner;
public class CondPaises {
	
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("¿Cual es el idioma de España? ");
	String respuesta = (s.nextLine());
	
	if (respuesta.equals("espanol")) {
	  System.out.println("Perfecto!");
	} else {
	  System.out.println("Esto no es lo tuyo...");
	}
}
}
