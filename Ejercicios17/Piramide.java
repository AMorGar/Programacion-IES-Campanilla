/*
*Alejandro Moreno Garrido
*Dibuja piramide permitiendo indicar la direccion del vertice
 */


public class Piramide {

  public static void main(String[] args) {
        

    System.out.print("Introduzca un carácter de relleno: ");
    String r = System.console().readLine();
    System.out.println("Elija un tipo de pirámide");
    System.out.println("1.Vertice hacia arriba");
    System.out.println("2.Vertice hacia abajo");
    System.out.println("3.Vertice hacia la izquierda");
    System.out.println("4.Vertice hacia la derecha");
    int x = Integer.parseInt(System.console().readLine());

    switch(x) {
      case 1:
        System.out.println("  " + r);
        System.out.println(" " + r + r + r);
        System.out.println(r + r + r + r + r);
        break;
      case 2:
        System.out.println(r + r + r + r + r);
        System.out.println(" " + r + r + r);
        System.out.println("  " + r);
        break;
      case 3:
        System.out.println("    " + r);
        System.out.println("  " + r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println("  " + r + " " + r);
        System.out.println("    " + r);
        break;
      case 4:
        System.out.println(r);
        System.out.println(r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println(r + " " + r);
        System.out.println(r);
        break;
      default:
    }
  }
}
