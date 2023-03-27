/*
Alejandro Moreno Garrido
* dados iguales
 */


public class Ejercicio13 {
	
	public static void main (String[] args) {
		int n1;
    int n2;   
    do {
      n1 = (int)(Math.random()*6)+1;
      n2 = (int)(Math.random()*6)+1;      
    } while (n1 != n2);
		System.out.println("dado1= " + n1 + " dado2= " + n2);
	}
}

