import java.util.Scanner;
/*Alejandro Moreno Garrido
* numeros aleatorios
 */


public class Ejercicio6 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int secreto = (int)(Math.random() * 101);
		int n;
		boolean test= false;
	  int oportunidades= 5;
    do {
      System.out.print("Introduce el numero: ");
      n =s.nextInt();
      oportunidades--;
      if (n == secreto) {
				System.out.println("Numero correcto");
        test = true;
      }
      if ((n>secreto)&&(oportunidades>0)){
        System.out.println("El numero es menor ");
        System.out.println("Oportunidades restantes: " + oportunidades);
      }
      
      if ((n<secreto)&&(oportunidades>0)){
        System.out.println("El numero es mayor ");
        System.out.println("Oportunidades restantes: " + oportunidades);
      }     
    }while ((oportunidades>0)&&(test==false));
    
  }	
	}


