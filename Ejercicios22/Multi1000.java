import java.util.Scanner;
/*
Alejandro Moreno Garrido
* Que no sumere 1000
 */


public class Multi1000 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int contNum=0;
		int sumatoria=0;
		int	media;
		int num;
		final int Limite=1000;
		
		do{
			System.out.print("Introduce un numero: ");
			num= s.nextInt();	
			sumatoria=sumatoria+num;
			contNum++;
			
		}while(sumatoria<Limite);
		
		media=sumatoria/contNum;
		
		System.out.println("la suma total es : "+sumatoria);
		System.out.println("La media es : "+media);
		System.out.println("Has introducido : "+contNum+" numeros");
	}
}

