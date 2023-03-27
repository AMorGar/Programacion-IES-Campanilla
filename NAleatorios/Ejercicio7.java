/*
Alejandro moreno Garrido
* quiniela
 */



public class Ejercicio7 {
  public static void main(String[] args) {
//No se que es pleno al 15, no juego a la quiniela  
    int n;
  
    for (int fila = 1; fila <= 14; fila++) {
      System.out.printf("|");
      for (int apuesta = 1; apuesta <= 3; apuesta++) {
        n=(int)(Math.random()*3) + 1;
        switch(n) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
						System.out.print(" X |");          
            break;
          case 3:
             System.out.print("  2|");
          default:
        }
      }
      System.out.println();
    }
    
	}
}

