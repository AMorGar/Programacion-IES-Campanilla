/*Alejandro Moreno Garrido
 * Precio de pasteles de una pasteleria
 **/

public class Pasteleria {

  public static void main(String[] args) {
   

    System.out.print("Elije el sabor: ");
    String sabor =  System.console().readLine().toLowerCase();
//Igualamos a 0 todas las variables ya que sino el programa no compila al detectar que hay calculos que no estaria resueltos
    double pSabor = 0;
    double pNombre = 0;
    double pNata = 0;
    
//La variable sabor chocolate no podemos igualarla a 0 debido a que es un string, por lo que la guardamos como un espacio en blanco par que posteriormente sea sustitudida dependiendod e al eleccion del sabor
    String saborChoco = "" ;
//sabor
    switch (sabor) {
      case "manzana":
        pSabor = 18;
        break;
      case "fresa":
        pSabor = 16;
        break;
      case "chocolate":
        System.out.print("Chocolate blanco o negro? ");
        saborChoco =  System.console().readLine().toLowerCase();
        if (saborChoco.equals("negro")) {
          pSabor = 14;
        } else if (saborChoco.equals("blanco")) {
          pSabor = 15;
        }
        break;
      default:
    }
    //Preferencias en el pedido
    System.out.print("Con nata? ");
    boolean conNata =  System.console().readLine().equals("si");
    
    System.out.print("Quieres ponerle nombre? ");
    boolean conNombre = System.console().readLine().equals("si"); 
    if (sabor.equals("chocolate")) {
      System.out.print("Tarta de " + sabor+" " + saborChoco);
    }
    System.out.println(":  "+ pSabor);
    if (conNata) {
      pNata = 2.5;
      System.out.println(" Con nata: "+ pNata);
    } 
     if (conNombre) {
      pNombre = 2.75;
      System.out.println("Con nombre: "+ pNombre);
    }
   double total=pSabor + pNata + pNombre ;
    System.out.println("Total:  "+total);
   }

}

