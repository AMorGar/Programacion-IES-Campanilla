import java.util.Scanner;
/*
Alejandro Moreno Garrido
* Contador de pares e impares
 */


public class Contador {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el  numero: ");
    long n =s.nextInt();
    long cifra;
    int contp=0;
    int conti=0;
    while(n>0){
			cifra=n%10;
			n=n/10;
			if(cifra%2==1){
				contp++;
			} else{
				conti++;
			}
	  }
	  System.out.print("Impares: "+conti);
	  System.out.print("pares: "+contp);
	}
}

