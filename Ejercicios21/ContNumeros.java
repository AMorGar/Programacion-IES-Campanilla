import java.util.Scanner;

/*
Alejandro Moreno Garrido
* Contar numeros
 */
public class ContNumeros {
	
  public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero: ");  
		int numero =s.nextInt();
    int n = numero;
    int cont = 1;
    
    while (n > 10) {
      cont++;
      n=n/10;
    }    
    System.out.println("Numero de digitos: "+cont);		
 
  }  
}
