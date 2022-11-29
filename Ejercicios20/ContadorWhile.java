/*
Alejandro Moreno Garrido
* Mostrar los 100 primeros  numeros
 */


public class ContadorWhile {
  public static void main(String[] args) {
	int i=1;
	while ( i <= 100) {
	  
	  if(i%5==0){
	  System.out.print(i+" ");
	  }	  
	  i++;
	}
  }
}
