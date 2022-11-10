/*Alejandro Moreno Garrido
 * Calcula area del rectangulo*/

public class AreaRectangulo {
	
	public static void main (String[] args) {
		
	String N1;
			System.out.print("Por favor, introduce la longitud de la base: ");
		N1 = System.console().readLine();
		double base;
					base = Integer.parseInt( N1 );
			System.out.print("Por favor, introduce la altura: ");
	String N2;
		N2 = System.console().readLine();
		double altura;
					altura = Integer.parseInt( N2 );
			
		double pesetas= base*altura;
			System.out.print("El area es: "+ pesetas);
		
	}
}

