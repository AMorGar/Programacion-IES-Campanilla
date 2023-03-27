/*
Alejandro Moreno Garrido
* contador de repeticiones
* 
 */


public class Ejercicio9 {
	
	public static void main (String[] args) {
		int n = 0;
    int cont = 0;
    
    while (n != 24) {
      n = (int)(Math.random() * 101);
      cont++;
    }
    System.out.println("Numeros generados: " + cont );
	}
}

