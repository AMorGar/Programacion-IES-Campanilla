import java.util.Scanner;
/*
alejandro Moreno Garrido 
* factorial
 */


public class Factorial {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el  numero: ");
    int n =s.nextInt();
   
    for(int i=1;i<=n;i++){
			int factorial=i; 
				for(int g=1;g<i;g++){ 
				factorial=factorial*g;			
				}		
		System.out.println(i+"! = "+factorial);
	  }  
	}
}

