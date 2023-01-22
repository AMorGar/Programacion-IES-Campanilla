import java.util.Scanner;
/*
Alejandro Moreno Garrido 
 */


public class Ejercicio7 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[100];
		for(int i=0;i<=100;i++){
		int n = ((int)(Math.random()*21));
		System.out.println(n+" ");
		a[i]=n;
		}

		int n1 =s.nextInt();
		int n2 =s.nextInt();
		
		
	}
}

