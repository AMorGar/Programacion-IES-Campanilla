/*
 *Alejandro Moreno Garrido
 *Condicional colores
 */

public class CondColores {
  public static void main(String[] args) {
	  
	System.out.print("¿Te gusa el color negro? ");
	String respuesta = System.console().readLine();
	
	if (respuesta.equals("si")) {
	  System.out.println("Perfecto!");
	} else {
	  System.out.println("El negro no es un color.");
	}
}
}
