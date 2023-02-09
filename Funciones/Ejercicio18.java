import misFunciones.Matematicas;
import misFunciones.Varios;
import java.util.Scanner;
/*
Alejandro moreno garrido
 */


public class Ejercicio18 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce tu DNI: ");
    long x =s.nextInt();
    System.out.println(misFunciones.Matematicas.DNI(x));; 	
		} 
   
	}


