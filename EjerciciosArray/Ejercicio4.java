/*
Alejandro Moreno Garrido
 */


public class Ejercicio4 {
	
	public static void main (String[] args) {
	  int[] n = new int[20];
	  int[] cubo = new int[20];
		int[] cua = new int[20];
			
		for (int i = 0; i < 20; i++) {
			n[i] = (int)(Math.random()*101);
			cubo[i] = cua[i] * n[i];
			cua[i] = n[i] * n[i];
		}	
		for (int g = 0; g < 20; g++) {
			System.out.println(n[g]);
			System.out.println(cua[g]);
			System.out.println(cubo[g]);
		}
	}
}

