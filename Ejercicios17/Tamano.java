/*
Alejandro Moreno Garrido
*Cuenta el numero de numeros
 */
public class Tamano {

  public static void main(String[] args) {
    
    int x; 
    int cont = 0;
    System.out.print("Introduce un numero : ");
    x = Integer.parseInt(System.console().readLine());
    
    if ( x < 10 ) {
      cont = 1;
    } else if (( x >= 10 ) && ( x < 100 )) {
      cont = 2;
    } else if (( x >= 100 ) && ( x < 1000 )) {
      cont = 3;
    } else if (( x >= 1000 ) && ( x < 10000 )) {
      cont = 4;
    } else if ( x >= 10000 ) {
      cont = 5;
    }
    
     if (cont == 1) {
      System.out.println("Tiene 1 numero.");
    } else {
      System.out.println("Tiene " + cont + " numeros.");
    }
  }
}
