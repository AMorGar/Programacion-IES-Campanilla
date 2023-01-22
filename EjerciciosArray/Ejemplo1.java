import java.util.Scanner;
/*
Alejandro Moreno Garrido
 */


public class Ejemplo1{
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[10];

		num[0] = 1;
		num[1] = 2;
		num[2] = 2*2;
		num[3] = 2*2*2;
		num[4] = 2*2*2*2;
		num[5] = 2*2*2*2*2;
		num[6] = num[2] * 10;
		num[7] = num[2] / 10;
		num[8] = num[0] + num[1] + num[2];
		num[9] = num[8];
		System.out.println("Introduce la posicon del array que quieres mirar");
		int n = s.nextInt();
		System.out.println(num[n]);
		System.out.println("-----------------------Lista de numeros-------------------------");	
		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
		System.out.println("-----------------------Los pares son-------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
			i++;
		}
		int suma=0;
		for (int i = 0; i < 10; i++) {		
			suma=num[i]+suma;
			i++;
		}	
		System.out.println("La suama de pares es= "+suma);
	}
}

