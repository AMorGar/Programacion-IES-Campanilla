/*
* Alejandro Moreno Garrido
* 3 dados
 */


public class Ejercicio1 {
	
	public static void main (String[] args) {
		int dado;
    int suma = 0;
    for(int i = 0; i < 3; i++) {
			dado=((int)(Math.random()*6 + 1));
			suma+=dado;
			System.out.println(dado);
		}
		System.out.println(suma);
	}
}

