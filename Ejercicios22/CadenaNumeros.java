import java.util.Scanner;
/*
Alejandro Moreno Garrido
* cadena numeros
 */


public class CadenaNumeros {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int suma=0;
		String pares=" ";
		System.out.print("Introduce el numero : ");
    long n =s.nextInt();	
    while(n>0){
			if((n%10)%2==0){
				suma+=(n%10);
				pares=(n%10) + pares;
			}
			n=n/10;
		}
		System.out.println("Numeros pares : "+ pares);
		System.out.println("La suma de pares es : "+suma);
	}
}

