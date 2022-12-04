/*
Alejandro Moreno Garrido
* Capicuas
 */
public class Capicua {

  public static void main(String[] args) {
//Declaramos variables    
    int n;
    boolean capicua = false;
    
    System.out.print("Introduce el numero de cifras: ");
    n = Integer.parseInt(System.console().readLine());  
//Asigna valor al booleano dependiendo de en que intervalo se encuentra   
    if (n < 10) {
      capicua = true;
    } else if((n >= 10)&&(n < 100)) {
      if ((n / 10)==(n % 10)) {
        capicua = true;
      }
    } else if((n >= 100)&&(n < 1000)) {
      if ((n / 100)==(n % 10)) {
        capicua = true;
      }
    } else if((n >= 1000)&&(n < 10000)) {
      if (((n / 1000)==(n % 10))&&((( n / 100 ) % 10)==(( n / 10) % 10))) {
        capicua = true;
      }
    } else if(n >= 10000) {
      if (((n / 10000) == (n % 10) )&&((((n / 1000) % 10))==((n / 10) % 10))) {
        capicua = true;
      }
    } else if (capicua) {
      System.out.println("El numero es capicua.");
    } else {
      System.out.println("El numero  no es capicua.");
    }
  }
}
