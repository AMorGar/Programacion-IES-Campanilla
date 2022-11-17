
import java.util.Scanner;
/*
Alejandro Moreno Garrido
* Nota media de 3 notas
 */


public class NotaMedia {

  public static void main (String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.print("Introduzca la primera nota: ");
	double n1 = s.nextDouble();
	System.out.print("Introduzca la segunda nota: ");
	double n2 = s.nextDouble();
	System.out.print("Introduzca la tercera nota: ");
	double n3 = s.nextDouble();
	
	double media= (n1+n2+n3)/ 3;
	System.out.print("la media es: "+media);
		
	}
}

