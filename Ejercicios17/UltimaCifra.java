/*
* 	Alejandro Moreno GArrido
* Indica ultima cifra de un numero introducido por teclado
 */

public class UltimaCifra {

  public static void main(String[] args) {
    
    System.out.print("Introduce un numero : ");
    int n = Integer.parseInt(System.console().readLine());
    int total =n % 10;
    System.out.println("La ultima cifra es: " + total);
  }
}
