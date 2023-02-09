
import misFunciones.Matematicas;
import java.util.Scanner;
/*
Alejandro moreno garrido
 */


public class Ejercicio9 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el numero: ");
    int x =s.nextInt(); 
    System.out.print("Introduce el numero: ");
    int y =s.nextInt(); 
    System.out.print("El mas pequeño es: "+ misFunciones.Matematicas.maximo(x,y));
    
    
	}
}

