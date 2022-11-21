/*
 * Alejandro Moreno Garrido
 * Ordenar numeros
 */
public class OrdenarNumeros {

  public static void main(String[] args) {
    
    
        
    System.out.println("Introduzca 3 numeros:");
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());
    int aux;
    
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Ordenados de menor a mayor son " + a + ", " + b + " y " + c); 
  }
}
