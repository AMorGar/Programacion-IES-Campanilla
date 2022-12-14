import java.util.Scanner;
/*
Alejandro Moreno Garrido
* Sistema palotes
 */


public class Palotes {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
    long n =s.nextInt();
    long cadena=0;
    long numero=n;
    int cont=0;
    while(n>0){
			numero=n%10;
			cadena=(cadena*10)+numero;
			n=n/10;	
			cont++;
		}			
		long cifra;
		for(int i=1;i<=cont;i++){
			cifra=cadena%10;
			cadena=cadena/10;
			for(int g=1;g<=cifra;g++){
				System.out.print(" | ");
			}
			System.out.print("-");
		}	
	}
}

