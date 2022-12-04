/*
Alejandro Moreno garrido
* Factura
 */
public class Factura {
  public static void main(String[] args) {

    System.out.print("Introduce la cifra: ");
    double base = Double.parseDouble(System.console().readLine());    
    System.out.print("Introduce el tipo de iva : ");
    String tIVA = System.console().readLine();    
    System.out.print("Introduce el código de promocion : ");
    String cpromo = System.console().readLine();
    
    int ivanum = 0;
// Asignar valor a la variable dependiendo de lo escrito en la varibale tIVA   
    switch(tIVA) {
      case "general":
        ivanum = 21;
        break;
      case "reducido":
        ivanum = 10;
        break;
      case "superreducido":
        ivanum = 4;
        break;
      default:
        System.out.println("El tipo de iva es erroneo.");
    }
    double descuento = 0;
    double iva = base * ivanum / 100;
    double preSinDesc = base + iva;
//Tipo de descuento segun el codigo de promocion
    switch(cpromo) {
      case "mitad": 
        descuento = preSinDesc / 2;
        break;
      case "nopro":
        break;
      case "meno5": 
        descuento = 5;
        break;
      case "5porc": 
        descuento = preSinDesc * 0.05;
        break;
      default:
        System.out.println("El codigo es erroneo.");
    } 
//Mostrar por pantalla   
    double total = preSinDesc - descuento;
    System.out.println("Base imponible       "+ base);
    System.out.println("IVA "+ivanum+"            " +iva );
    System.out.println("Precio con IVA       "+ preSinDesc);
    System.out.println("Cód. promo. "+ cpromo+"  "+ descuento);
    System.out.println("TOTAL                "+ total);
  }
}
