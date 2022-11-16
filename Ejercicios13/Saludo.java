import java.util.Scanner;
/*
 *Alejandro Moreno Garrido
 *saluda dependiendo de la hora
 */




public class Saludo {
	
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Introduzca la hora: ");
	int hora = s.nextInt();


	if ((hora>=6) || (hora<=12)) {
	  System.out.print("Buenos dias");
	} else if((hora>=13) || (hora<=20)) {
	  System.out.println("Buenas tardes");
	} else  {
	  System.out.println("Buenas noches");
	} 
}
}
