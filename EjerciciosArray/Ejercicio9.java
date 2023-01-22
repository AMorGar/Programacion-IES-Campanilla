import java.util.Scanner;
/*
Alejandro Moreno Garrido 
 */


public class Ejercicio9 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array = new int[100];
		for(int i=0;i<10;i++){
			System.out.println("Introduce un numero entero");
			array [i] = s.nextInt();
		}
		for(int i=0;i<10;i++){
			if(array [i]%2==1){
				System.out.println(array [i]+"Es impar");
			} else{
				System.out.println(array [i]+"Es par");	
				}
		}	
	}
}

