import java.util.Scanner;	
/*
 * Alejandro Moreno Garrido
Numero de cofras fibonacci
* 
 */

public class Fibonacci{
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero de cifras: ");  
		int numero =s.nextInt();

    if (numero==1) {
        System.out.print("  0 ");
      }
    if (numero==2){
        System.out.print(" 0  1 ");
			} else{ 
					System.out.print(" 0  1 ");
					int n1 = 0;
					int n2 = 1;
					int aux;
					
					while(numero>2){
						aux = n1;
						n1 = n2;
						n2 = aux + n2;
						System.out.print("  " + n2);
						numero--;
        }
    }


	}
}

