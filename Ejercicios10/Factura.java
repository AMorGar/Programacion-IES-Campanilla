/*Alejandro Moreno Garrido
 * Calcula el valor a pagar en una factura incluyendo el iva*/


public class Factura {
	
	public static void main (String[] args) {
		
	String N1;
			System.out.print("Por favor, introduce la longitud de la base: ");
	N1 = System.console().readLine();
	double dinero;
			dinero = Integer.parseInt( N1 );
		
	double total=dinero*1.25;
			System.out.print("El total con IVA es: "+ total);
	
	}
}

