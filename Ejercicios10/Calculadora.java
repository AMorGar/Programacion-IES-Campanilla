/* Alejandro Moreno Garrido
Calculadora de numeros introducidos por teclado */

public class Calculadora{
	
	public static void main (String[] args) {
		
	String N1;
	String N2;
			System.out.print("Por favor, introduzca el primer numero: ");
					 N1 = System.console().readLine();
	double primernumero;
				primernumero = Integer.parseInt( N1 );
			System.out.print("Por favor, introduzca el segundo numero: ");
				 N2 = System.console().readLine();
	double segundonumero;
				segundonumero = Integer.parseInt( N2 );
	 
	double resultado= primernumero*segundonumero;
	
				System.out.println("La multiplicacion es: "+resultado);	
	double resultado1= primernumero/segundonumero;
	
				System.out.println("La division es: "+resultado1);	
	double resultado2= primernumero-segundonumero;
	
				System.out.println("La resta es es: "+resultado2);	
	double resultado3= primernumero+segundonumero;
	
				System.out.println("La suma es: "+resultado3);	

	}
}
