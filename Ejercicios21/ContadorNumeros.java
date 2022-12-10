import java.util.Scanner;	
/*
 * Alejandro Moreno Garrido
contar numeros negarivosmy positivos
* 
 */

public class ContadorNumeros{
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int cont=1;
		int contn=0;
		int contp=0;
		System.out.println("Introduce los numeros: ");
		do{ 
			int numero =s.nextInt();
			if(numero<0){
				contn++;
			}
			if(numero>0){
				contp++;
			}
			cont++;
		}while(cont<=10);  
     System.out.println("numeros negativos= "+contn);
     System.out.println("numeros positivos= "+contp);
		}

	}



