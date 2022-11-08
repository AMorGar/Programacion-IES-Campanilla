//Alejandro Moreno Garrido
//Multiplica numeros introducidos por teclado

public class Multiplicacion {
	
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
	
System.out.println("El resultado es: "+resultado);	
	}
}

