/*
Alejandro Moreno Garrido
* Precio Entrada cine
 */

public class EntradaCine {
  public static void main(String[] args) {

    System.out.print("Indica el numero de entradas: ");
    int entradas = Integer.parseInt(System.console().readLine());
//declarar variables 
	  double precioPersona = 8;
    int entradaPersona = entradas;
    int entradaPareja = 0;
    double descuento = 0;
    double total = 0;
    double Pagar = 0;

    System.out.print("Indica el dia de la semana: ");
    String dias = System.console().readLine();
// tarjeta socio = tarjeta Cine 
    System.out.print("Tienes tarjeta de socio? (si/no): ");
    boolean tieneTarjeta = (System.console().readLine()).equals("si");
//Precio dependiendo del dia
    switch (dias) {
      case "miércoles":
        precioPersona = 5;
      case "jueves":
        entradaPareja = entradas / 2;
        entradaPersona = entradas % 2;
      default:
    }
    total = precioPersona * entradaPersona;
    total += 11 * entradaPareja;
//Descuento si tiene tarjeta
    if(tieneTarjeta) {
      descuento = total * 0.1;
    }
    Pagar = total - descuento;
//Mostrar resultados 
	  if (entradaPersona > 0) {
      System.out.println("Entradas individuales         "+ entradaPersona);
      System.out.println("Precio por entrada individual "+ precioPersona);
    } else if (entradaPareja > 0) {
      System.out.println("Entradas de pareja            " +entradaPareja);
      System.out.println("Precio por entrada de pareja  "+ 11.0);
    }

    System.out.println("Total                         "+ total);
    System.out.println("Descuento                     "+ descuento);
    System.out.println("A pagar                       "+ Pagar);
  }
}
