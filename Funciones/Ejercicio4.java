
import misFunciones.Matematicas;
import java.util.Scanner;
/*
Alejandro moreno garrido
 */


public class Ejercicio4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el numero: ");
    int x =s.nextInt(); 
    int n=misFunciones.Matematicas.dimesigno(x);
    if(n==-1){
				System.out.print("El numero es negativo");
		} else if(n==0){
				System.out.print("El numero es cero");
		} else if(n==1){
				System.out.print("El numero es positivo");
		}
    
    
	}
}
