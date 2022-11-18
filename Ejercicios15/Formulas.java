
import java.util.Scanner;
/*
*Alejandro Moreno Garrido
*Area objetos
 */


public class Formulas {
	
  public static void main (String[] args) {
	Scanner s = new Scanner(System.in);	
	System.out.println("Por favor introduzca el numero del area que desee calcualar: ");
	System.out.println("1.Triangulo ");
	System.out.println("2.Rombo ");
	System.out.println("3.Romboide ");
	System.out.println("4.Trapecio ");
	int list = s.nextInt();
	
	switch (list)
	{
	case 1:
	  System.out.println("Triangulo:");
	  System.out.println("Introduce base:");
	  double x = s.nextDouble();
	  System.out.println("Introduce altura:");
	  double y = s.nextDouble();
	  double total= (x*y)/2;
	  System.out.println("El area es: "+total);
	  break;
	case 2:
	  System.out.println("Rombo:");
	  System.out.println("Introduce diagolan mayor:");
       x = s.nextDouble();
      System.out.println("Introduce diagolan menor:");
	   y = s.nextDouble();
	   total= (x*y)/2;
	   System.out.println("El area es: "+total);
	  break;
	case 3:
	System.out.println("Romboide:");
	  System.out.println("Introduce base:");
	   x = s.nextDouble();
	  System.out.println("Introduce altura:");
	   y = s.nextDouble();
	  total= x*y;
	  System.out.println("El area es: "+total);
	  break;
	case 4:
	System.out.println("Trapecio:");
	System.out.println("Introduce base mayor:");
	  x = s.nextDouble();
	  System.out.println("Introduce base menor:");
	  y = s.nextDouble();
	  System.out.println("Introduce altura.");
	  double z = s.nextDouble();
	  total= ((x+y)*z)/2;
	  System.out.println("El area es: "+total);
	  break;
	default:
	  System.out.println("Orden equivocada");
	}
		 
}
}
		
	


