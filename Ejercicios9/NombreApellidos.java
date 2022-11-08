//Alejandro Moreno Garrido
//Pide nombre y apellido

public class NombreApellidos {
	public static void main(String[] args) {
//declaramos las variables
		String nombre;
		String apellido;
//Pedimos los numeros que se alamacenaran en las variables
			System.out.print("Por favor, dime cómo te llamas: ");
				nombre = System.console().readLine();
			System.out.print("Por favor, dime tus apellidos: ");
				apellido= System.console().readLine();
//imprimimos por pantalla				
		System.out.println("Hola " + nombre + apellido +", ¡encantado de conocerte!");
}
}
