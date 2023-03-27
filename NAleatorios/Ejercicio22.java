import java.util.Scanner;
/*
Alejandro Moreno Garrido
* Serpiente
 */


public class Ejercicio22 {	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    System.out.print("Cuanto mide la serpiente:? ");
    int tamano =s.nextInt();
    int random;
    System.out.println("            @");
    int i;
    int posicion=12;
        
    while (tamano > 1) {		
			random=(int)(Math.random()*3)-1;
      posicion= posicion+random;
      for (i = 1; i <= posicion; i++) {
        System.out.print(" ");
      }
      tamano--;
      System.out.println("*");

    }
	}
}

