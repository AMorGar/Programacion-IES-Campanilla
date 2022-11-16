import java.util.Scanner;
/*
Alejandro Moreno Garrido
*Sueldo
 */


public class CondSueldo{
	
  public static void main (String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.print("Introduzca las horas de trabajo: ");
	int hora = s.nextInt();

	int total;
	if (hora<=40) {
	  total=hora*12;
	  System.out.print("Tu sueldo es: " +total);
	  
	}else{
	  total=hora*16;
	  System.out.print("Tu sueldo es: " +total);
	} 
	}
}

