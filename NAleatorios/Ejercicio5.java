
/*Alejandro Moreno Garrido
* numeros aleatorios
 */


public class Ejercicio5 {
	
	public static void main (String[] args) {
		int max = 100;
    int min = 199;
    int sum = 0;
    int x;
    
    for (int i = 0; i < 50; i++) {
      x = (int)(Math.random()*100) + 100;
      System.out.print(x+" ");  
      if (x>max) {
        max=x;
      }  
      if (x<min) {
        min = x;
      }      
      sum=sum+x; 
    }
    System.out.println("Maximo: " + max);   
    System.out.println("Minimo: " + min);
    System.out.println("Media: " + sum/50);
	}
}

