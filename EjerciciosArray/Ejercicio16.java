import java.util.Scanner;
/*
Alejandro Moreno Garrido
 */

public class Ejercicio16 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int num[]=new int [20];
		int resp=0;
		
		for(int i=0;i<20;i++){
			num[i]=(int)(Math.random()*401);
			System.out.print(num[i]);
	  }
	  System.out.println("1- multiplos de 7");
	  System.out.println("2- multiplos de 5");
	  
	  resp= s.nextInt();
	  switch(resp){
				case 1:
					for(int i=-1;i<19;i++){
						if(num[i+1]%7==0){
							System.out.println(num[i+1]+" ");
						} else{
								System.out.println(num[i+1]+" ");
							}
					}
				
				case 2:
					for(int j=-1;j<19;j++){
						if(num[j+1]%7==0){
							System.out.println(num[j+1]+" ");
						} else{
								System.out.println(num[j+1]+" ");
							}
					}
				break;
				}

		}
	  
	  
	}	


