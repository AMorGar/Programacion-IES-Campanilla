//Alejandro Moreno Garrido
//Pide nombre y apellido

public class NombreApellidos {
	public static void main(String[] args) {
//declaramos las variables
		String Nombre;
		String Apellido;
//Pedimos los numeros que se alamacenaran en las variables
			System.out.print("Por favor, dime cómo te llamas: ");
				Nombre = System.console().readLine();
			System.out.print("Por favor, dime tus apellidos: ");
				Apellido= System.console().readLine();
//imprimimos por pantalla				
		System.out.println("Hola " + Nombre + Apellido +", ¡encantado de conocerte!");
}
}
