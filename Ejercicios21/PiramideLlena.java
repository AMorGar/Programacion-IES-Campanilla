import java.util.Scanner;
/*
 * Alejandro Moreno Garrido
 * Piramide rellena
 */
public class PiramideLlena {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int num= s.nextInt();
    System.out.print("Introduce el caracter : ");
    String relleno = System.console().readLine();

    for (int i = 0; i < num; ++i) { 
      System.out.println(); 
			for (int j = 0; j < num-i-1; ++j) { 
				System.out.print(" ");
      } 

      for (int j = 0; j < 2*i+1; ++j){ 
				System.out.print(relleno); 
       } 

     } 
		System.out.println(); 

            }
    }
