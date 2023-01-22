/*
Alejandro Moreno Garrido
 */


public class Ejercicio3Bidi {
	
	public static void main (String[] args) {

		int [][] num =new int [4][5];
		int suma=0;
		int aux=0;
		System.out.print("Introduce 20 numeros: ");
		for(int fila=0;fila<4;fila++){
			for(int columna=0;columna<5;columna++){
				num[fila][columna]=(int)((Math.random()*900)+100);
			}	
		}
		for(int fila=0;fila<4;fila++){
			for(int columna=0;columna<5;columna++){
				suma+=num[fila][columna];
			}
			System.out.println("fila "+fila+" : "+suma);
			aux+=suma;
			suma=0;
		}
		for(int columna=0;columna<5;columna++){
			for(int fila=0;fila<4;fila++){
				suma+=num[fila][columna];
			}
			System.out.print(" col "+columna+": "+suma);
			aux+=suma;
			suma=0;
		}

		System.out.print(" total: "+aux);
	}
}
