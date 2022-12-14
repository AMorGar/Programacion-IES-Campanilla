import java.util.Scanner;
/*
Alejandro Moreno Garrido
* cadena numeros pares e impares
 */


public class ParesImpares {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
    long n1 =s.nextInt();
    System.out.print("Introduce el segundo numero: ");
    long n2 =s.nextInt();
    long result;
    String pa=" ";
		String in=" ";
		while(n1>0){
			result=n1%10;
			if(result%2==1){
				pa=pa+result;
			} else {
				in=in+result;
			}
			n1=n1/10;	
		} 
		while(n2>0){
			result=n2%10;
			if(result%2==1){
				pa=pa+result;
			} else {
				in=in+result;
			}
			n2=n2/10;	
		} 
		System.out.println("Introduce el segundo numero: "+pa);
		System.out.println("Introduce el segundo numero: "+in);
	}
}

