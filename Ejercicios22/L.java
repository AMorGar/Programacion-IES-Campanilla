import java.util.Scanner;
/*
Alejandro Moreno Garrido
* L
 */


public class L {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la altura de la L : ");
    int num =s.nextInt();	
    
    for(int i=1;i<=num;i++){
		System.out.println("*");			
		}
		int calc=(num+1)/2;
		for(int j=1;j<=calc;j++){
		System.out.print("* ");				
		}
	}
}

