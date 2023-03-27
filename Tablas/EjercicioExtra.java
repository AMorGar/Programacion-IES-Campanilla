import java.util.Scanner;
/*
Alejandro Moreno Garrido
 */


public class EjercicioExtra {
	
	public static void main (String[] args) {
		int x=5;
		int y=10;
		int[][] array = new int[x][y];
		int suma2=0;
		int suma=0;
		for(int b=0; b < x; b++){	

			for(int a=0; a<y;a++){

				array[b][a] = suma+suma2;	
				System.out.println(array[b][a]);	
				suma+=10	;		
			}	
			System.out.println();
			suma=0;
			suma2=+2;
		}
	}                                     
}

