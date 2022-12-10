import java.util.Scanner;	
/*
 * Alejandro Moreno Garrido
Media de numeros positivos por teclado
 */

public class Media {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		double media;
		int nota;
		int cont=1;
		int sumatorio=0;
		do{
			System.out.println("Introduce el numero: ");  
			nota =s.nextInt();
			sumatorio = sumatorio+nota;	
			cont++;
    }while(nota>=0);
     
    media=sumatorio/cont;
    System.out.println("La media es: "+media); 
	}
}

