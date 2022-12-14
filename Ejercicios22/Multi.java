import java.util.Scanner;
/*
Alejandro Moreno Garrido
*hacer medias y decir cual es el mayor
 */


public class Multi {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int contNum=0;
		int sumaImpares=0;
		int mayorPares=0;
		int mediaImpares;	
		int num;
		do{
			System.out.print("Introduce un numero: ");
			num= s.nextInt();	
			if(num>=0){
				if(num%2==1){
					if(num>mayorPares){
					mayorPares=num;
					}			
				} else{
				sumaImpares=sumaImpares+num;
				}
				contNum++; 
			}			
		}while(num>=0);
		mediaImpares=sumaImpares/contNum;
		System.out.println("El numero par mayor es : "+mayorPares);
		System.out.println("La media de impares es : "+mediaImpares);
		System.out.println("Has introducido : "+contNum+"numeros");
		
	}
}

