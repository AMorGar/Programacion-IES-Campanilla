/*
Alejandro Moreno Garrido
 * Notas musicales
 */


public class Ejercicio15 {
	
	public static void main (String[] args) {
		int n = ((int)(Math.random()*7+1)*4);
    String notaMusical = "";
    String musica = "";
    int r;

    for (int i = 1; i <= n; i++) {
			r=(int)(Math.random()*8);
      switch(r) {
        case 0:
          notaMusical = "do menor";
          break;
        case 1:
          notaMusical = "re";
          break;
        case 2:
          notaMusical = "mi";
          break;
        case 3:
          notaMusical = "fa";
          break;
        case 4:
          notaMusical = "sol";
          break;
        case 5:
          notaMusical = "la";
          break;
        case 6:
          notaMusical = "si";
          break;
        case 7:
          notaMusical = "do mayor";
          break;
        default:
      }
      if (i == n) {
        notaMusical = musica;
      } else if (i == 1) {
					musica = notaMusical;
      }

      System.out.print(notaMusical + " , ");

      if (i%4== 0) {
        System.out.print("|");
      }
    }
	}
}

