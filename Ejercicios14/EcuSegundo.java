import java.util.Scanner;
/*
Alejandro Moreno garrido
* Ecucacion de segundo grado
 */


public class EcuSegundo {
	
  public static void main (String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.print("Introduzca el valor de a: ");
	double a = s.nextDouble();
	System.out.print("Introduzca lel valor de b: ");
	double b = s.nextDouble();
	System.out.print("Introduzca el valor de c: ");
	double c = s.nextDouble();
	double cuadrado=Math.pow(b,2);
	double calculos= cuadrado-4*a*c;
	double raiz = Math.sqrt(calculos);
	double total1= -b+calculos/2*a;
	double total2= -b-calculos/2*a;
	
	System.out.print("X1= "+total1+" X2= "+total2);
	
	
	}
}

