import java.util.Scanner;	
/*
Alejandro Moreno Garrido
* contador de 7 en 7
 */


public class Contador {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.print("Introduce el numero inferior: ");
    int n1 = s.nextInt();    
    System.out.print("Introduce el numero superior: ");
    int n2 = s.nextInt();
    
  while(n1<=n2){
		System.out.println(n1);
		n1=n1+7;			
		}
	
}
}
