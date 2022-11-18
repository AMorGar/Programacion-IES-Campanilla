import java.util.Scanner;
/*Alejandro Moreno Garrido
 * Horario
 */


public class Horario {
	
  public static void main (String[] args) {
	Scanner s = new Scanner(System.in);	
	System.out.println("Introduce dia de la semana");
	int list = s.nextInt();	
	
	switch (list)
	{
	case 1:
	  System.out.print("Programacion");
	  break;
	case 2:
	  System.out.print("Programacion");
	  break;
	case 3:
	  System.out.print("Sistemas");
	  break;
	case 4:
	  System.out.print("programacion");
	  break;
	case 5:
	  System.out.print("Programacion");
	  break;
	default:
	  System.out.println("No existe ese dia");
	}
}
}

