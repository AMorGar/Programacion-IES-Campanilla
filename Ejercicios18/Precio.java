/*
Alejandro Moreno Garrido
* Precio de una bandera
 */
public class Precio {

  public static void main(String[] args) {

    System.out.print("Introduce altura de bandera en cm: ");
    int alto = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la anchura: ");
    double ancho = Integer.parseInt(System.console().readLine());
    System.out.print("Escudo bordado? (si o no): ");
    boolean conEsc = ((System.console().readLine()).toLowerCase()).equals("si");
	  double precioEsc;
    String escudo;
    //Cambiar variable dependiendo de si quiere escudo o no
    if (conEsc) {
      escudo = "Con escudo";
      precioEsc = 2.50;
    } else {
      escudo= "Sin escudo";
      precioEsc = 0;
    }
	  double medidas= ancho*alto/100;
    double total=ancho*alto/100+precioEsc+3.25;
    //Cuenta
    System.out.println("Bandera de"+ancho*alto+": "+medidas);
    System.out.println(escudo+ " :         "+ precioEsc);
    System.out.println("Gastos de envio :      "+ 3.25);
    System.out.println("Total :                "+ total);
  }
}
