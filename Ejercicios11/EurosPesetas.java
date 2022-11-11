/*Alejandro Moreno Garrido
Conversor de euros a pesetas
 */
import java.util.Scanner;

public class EurosPesetas {
	
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el numero de euros: ");
	int pesetas = Integer.parseInt(s.nextLine());

	int sol=pesetas*160;
	System.out.println("La solucion es:  " + sol);	  
	}
}

