/*
Alejandro Moreno Garrido
* Maquina tragaperras
 */


public class Ejercicio16 {
	
	public static void main (String[] args) {
		int n1 = 0;
    int n2 = 0;
    int n3 = 0;   
    int n;

    for (int i=0;i<3;i++) {
      n = ((int)(Math.random()*5));

      switch(n) {
        case 0:
          System.out.print("Diamante ");
          break;
        case 1:
          System.out.print("Herradura ");
          break;
        case 2:
          System.out.print("Limon ");
          break;
        case 3:
          System.out.print("Corazon ");
          break;
        case 4:
          System.out.print("Campana ");
          break;
        default:
      }   
      switch(i) {
        case 0:
          n1 = n;
          break;
        case 1:
          n2 = n;
        break;
        case 2:
          n3 = n;
        break;
        default:
      }
    }
    System.out.println();
    if ((n1 == n2) && (n2 == n3)) {
      System.out.println("Ganaste 10 monedas");
    } else if ((n1!=n2) && (n1!=n3) && (n2 != n3)) {
      System.out.println("Perdiste");
    } else {
      System.out.println("Intentalo de nuevo");
    }
	}
}

