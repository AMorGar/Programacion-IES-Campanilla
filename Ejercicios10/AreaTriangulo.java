


/*Alejandro Moreno Garrido
 * Calcula area del triangulo*/
public class AreaTriangulo {
	
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
			
		double area= (base*altura)/2;
			System.out.print("El area es: "+ area);
		
		
	}
}

