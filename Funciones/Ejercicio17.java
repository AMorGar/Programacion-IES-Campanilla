import misFunciones.Matematicas;
import misFunciones.Varios;
import java.util.Scanner;
/*
Alejandro moreno garrido
 */


public class Ejercicio17 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int x=1;
		while(x>0){
		System.out.print("Introduce un numero: ");
    x =s.nextInt();
    System.out.println(misFunciones.Matematicas.primo(x));; 	
		} 
   
	}
}

