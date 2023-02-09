
import misFunciones.Matematicas;
import java.util.Scanner;
/*
Alejandro moreno garrido
 */


public class Ejercicio8 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el numero: ");
    int x =s.nextInt(); 
    System.out.print("La suma de 1 a N es: "+ misFunciones.Matematicas.suma1aN(x));
    System.out.print("La suma de 1 a N es: "+ misFunciones.Matematicas.producto1aN(x));
    System.out.print("La suma de 1 a N es: "+ misFunciones.Matematicas.intermedio1aN(x));
    
    
	}
}

