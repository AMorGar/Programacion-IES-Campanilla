import java.util.Scanner;
/*
Alejandro Moreno Garrido
* Tabla de multiplicar
 */


public class Tabla {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
	  System.out.println("Introduce el numero: ");  
	  int n =s.nextInt();
	  int calc=1;
	  for(int i=1;i<=10;i++){
		calc = n*i;	
		System.out.println(n+" X "+i+" = "+calc);	
		}
	}
}

