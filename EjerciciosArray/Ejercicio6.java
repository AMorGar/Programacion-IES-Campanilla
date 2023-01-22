import java.util.Scanner;
/*
Alejandro Morneo Garrido 
 */


public class Ejercicio6 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		  int[] numero = new int[15];
      int i;      
      for (i = 0; i < 15; i++) {
        numero[i] = s.nextInt();
      }
      System.out.println();
      for (i = 0; i < 15; i++) {
        System.out.print(i);
      }
      System.out.println("----------------------");

      for (i = 0; i < 75; i++) {
				System.out.println("----------------------");
      }
      System.out.println("----------------------");
      for (i = 0; i < 15; i++) {
        System.out.print(numero[i]);
      }
      System.out.println("----------------------");

      int aux = numero[14];
      for (i = 14; i > 0; i--) {
        numero[i] = numero[i-1];
      }
      numero[0] = aux;

      System.out.println("\nArray rotado a la derecha una posición:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("----------------------");
      for (i = 0; i < 75; i++) {
        System.out.print("-");
      }
      System.out.println("----------------------");;
      for (i = 0; i < 15; i++) {
        System.out.print(numero[i]);
      }
      System.out.println("----------------------");
	}
}

