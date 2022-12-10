import java.util.Scanner;	
/*
 * Alejandro Moreno Garrido
Calcula el cuadrado y el cubo
* 
 */

public class CuadradoCubo{
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero: ");  
		int numero =s.nextInt();
		int limite =numero+5;

    for (int i = numero; i <limite; i++) {
      System.out.println( i+"  "+ i * i+"  "+ i * i * i);
		}

	}
}


