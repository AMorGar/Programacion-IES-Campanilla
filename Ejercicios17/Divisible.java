/*
Alejandro Moreno Garrido
* Divisible entre 5
 */


public class Divisible {

  public static void main(String[] args) {
        
    System.out.print("Intruduzca un numero: ");
    int x = Integer.parseInt(System.console().readLine());

    if ((x % 2)==0) {
      System.out.print("El numero  es par");
    } else {
      System.out.print("El numero  es impar");
    }

    if ((x % 5)==0) {
      System.out.println(" y divisible entre 5");
    } else {
      System.out.println(" y no divisible entre 5");
    }
  }
}
