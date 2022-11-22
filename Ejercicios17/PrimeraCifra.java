/*
Alejandro Moreno Garrido
* indica el primer numero
 */
public class PrimeraCifra {

  public static void main(String[] args) {
    
    int x; 
//inicializamos la variable en 0 por si el numero introducido es 0
    int n = 0; 
    
    System.out.print("Introduzca un numero : ");
    x = Integer.parseInt(System.console().readLine());
    
    if ( x < 10 ) {
      n = x;
    } else if (( x >= 10 ) && ( x < 100 )) {
      n = x / 10;
    } else if (( x >= 100 ) && ( x < 1000 )) {
      n = x / 100;
    } else if (( x >= 1000 ) && ( x < 10000 )) {
      n = x / 1000;
    } else if ( x >= 10000 ) {
      n = x / 10000;
    }
    
    System.out.println("La primera cifra es: " + n + ".");
  }
}
