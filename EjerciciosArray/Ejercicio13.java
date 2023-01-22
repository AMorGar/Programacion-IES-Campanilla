import java.util.Scanner;
/*
Alejandro Moreno Garrido
 */

public class Ejercicio13 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n1 = new int[100];
		int selec;
		int num=0;
		int max=0;
		int min=500;
		for (int i = 0; i < 100; i++) {
			num = ((int)(Math.random()*501));		
			n1[i]=num;
			if(num>=max){
				max=num;
			}
			if(num<=min){
				min=num;				
			}
    }
    for (int i = 0; i < 100 ;i++) {
			 System.out.print(n1[i]);
		}
		System.out.println("1 – minimo: ");
		System.out.println("2 – maximo: ");
		selec = s.nextInt();
		
		
		if(selec==1){
			for (int i = 0; i < 100; i++) {
			if(n1[i]==min){
				System.out.println("**"+n1[i]+"**");
			} else{
					System.out.print(n1[i]);	
				}
			}
		}
		if(selec==2){
			for (int i = 0; i < 100; i++) {
			if(n1[i]==max){
				System.out.println("**"+n1[i]+"**");
			} else{
					System.out.print(n1[i]);	
				}
			}
		} else{
				System.out.println("Esa eleccion no existe");
			}
	}
}


