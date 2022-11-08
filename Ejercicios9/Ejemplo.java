//Alejandro Moreno Garrido
//Cambia el tipo de variable 

public class Ejemplo {
public static void main(String[] args) {

String linea;
	System.out.print("Por favor, introduce un número: ");
		linea = System.console().readLine();
			double primerNumero;
				primerNumero = Double.parseDouble( linea );
	System.out.print("introduce otro, por favor: ");
		linea = System.console().readLine();
			double segundoNumero;
				segundoNumero = Double.parseDouble( linea );
double total;
	total = (2 * primerNumero) + segundoNumero;
		System.out.print("El primer número introducido es " + primerNumero);
		System.out.println(" y el segundo es " + segundoNumero);
}
}
