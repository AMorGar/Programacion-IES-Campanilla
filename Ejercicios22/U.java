import java.util.Scanner;
/*
Alejandro Moreno Garrido
* U
 */


public class U {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la altura : ");
    int n =s.nextInt();
    int base=n-2;
    
    for(int i=1;i<n;i++){
			System.out.println(); 
			for(int j=1;j<=n;j++){
				if((j==n)||(j==1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		}
		System.out.println();
		for(int g=1;g<=n-1;g++){
			if((g==n)||(g==1)){
					System.out.print(" ");
			}else{
					System.out.print("*");
				}
		}
	}
}

