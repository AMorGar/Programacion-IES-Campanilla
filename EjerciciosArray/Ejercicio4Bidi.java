/*
 Alejandro Moreno Garrido
*/

public class Ejercicio4Bidi {

	public static void main(String [] args)
		
		throws InterruptedException {
		int[][] num = new int[4][5];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				num[i][j] = (int)(Math.random()*1000 + 100);
			}
		}	
		System.out.println(" ");
		int sumaI;
		for(int i = 0; i < 4; i++) {
			sumaI = 0;
			for(int j = 0; j < 5; j++) {
				System.out.printf("%8d",num[i][j]);
				sumaI += num[i][j];
				Thread.sleep(100);
			}
			System.out.printf("%8d", sumaI);
			Thread.sleep(200);
			System.out.println();
		}
		int sumaJ;
		int total = 0;
		for(int j = 0; j < 5; j++) {
			sumaJ = 0;
			for(int i = 0; i < 4; i++) {
				sumaJ += num[i][j];
			}
			total += sumaJ;
			System.out.printf("%8d", sumaJ);
			Thread.sleep(200);
		}
		
		System.out.printf("%8d", total);
		Thread.sleep(400);
	
	}
}
