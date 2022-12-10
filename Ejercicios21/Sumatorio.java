import java.util.Scanner;	
/*
*Alejandro Moreno Garrido
*Sumatorio numeros 
 */


public class Sumatorio {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int total=0;
		do{
			System.out.print("Introduce el numero : ");
			n = s.nextInt();
		}while(n<=0);
		
		for(int i=0;i<100;i++){
			total=total+n;
			n=n+1;
		}
		System.out.print("Resultado= "+total);
		
	} 
}

