/*
Alejandro Moreno GArrido
 */


public class Ejercicio10 {
	
	public static void main (String[] args) {
		int[] n = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int pares = 0;
    int imp= 0;
    
    for (int i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 101);
      if (n[i] % 2 == 0) {
        par[pares] = n[i];
        pares++;
      } else{
        impar[imp] = n[i];
        imp++;
      }
    }   
    for ( int j = 0; j < pares; j++) {
      n[j] = par[j];
    }    
    for (int k = pares; k < 20; k++) {
      n[k] = impar[k - pares];
    }
    for (int g = 0; g < 20; g++) {
      System.out.print(n[g] +" ");
    }
    System.out.println(" ");

    System.out.println("---------------------------------------------------------");
    for (int h = 0; h < 20;h++) {
      System.out.print(n[h] +" ");
    }
	}
}

