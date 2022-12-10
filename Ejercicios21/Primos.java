import java.util.Scanner;	
/*
Alejandro Moreno Garrido
* Numero primo
 */
public class Primos {

  public static void main(String[] args) {
 		Scanner s = new Scanner(System.in);           
    System.out.print("Introduce el numero : ");
    int n = s.nextInt(); 
    int vig=0;
    int calcu;
    for (int i=2;i<n;i++) {
			calcu=n%i;
      if (calcu==0) {
        vig=1;
      }
    }        
    if (vig==0) {
      System.out.println("Es primo");
    } else {
      System.out.println("No es primo");
    }

  }
}
