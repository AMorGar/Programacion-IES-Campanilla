import java.util.Scanner;
/*
 * Alejandro Moreno Garrido
 */


public class Ejercicio17 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la anchura del cuadrado: ");
    int x = Integer.parseInt(System.console().readLine());   
		System.out.print("Introduce la altura del cuadrado: ");
    int y = Integer.parseInt(System.console().readLine());
    int ubi = 0;

    int n = (int)(Math.random()*(y - 2)*(x - 2));

    // Pinta la parte superior /////////////////////////////////////////////////
    for(int i = 0; i < y; i++) {
      System.out.print("*");
    }
    System.out.println();

    // Pinta la parte central //////////////////////////////////////////////////
    for(int i = 2; i < y; i++) {
      System.out.print("*"); // parte izquierda de la pecera
      for(int j = 2; j < x; j++) {
        if (ubi != n) {
          System.out.print(" ");
        } else {
          System.out.print("@");
        }
        ubi++;
      } 
      System.out.println("*"); 
    }
    for(int i = 0; i < x; i++) {
      System.out.print("*");
    }
	}
}

