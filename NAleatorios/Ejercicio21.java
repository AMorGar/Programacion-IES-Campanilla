/*
Alejandro moreno Garrido
* monedas
 */


public class Ejercicio21 {	
	public static void main (String[] args) {
		String cantidad = " ";
    String cara = " ";
    int n;
    int k;
    for (int i = 0; i < 5; i++) {
			n=(int)(Math.random()*7)+1;
      switch(n) {
        case 1:
          cantidad = "1 centimo";
          break;
        case 2:
          cantidad = "5 centimos";
          break;
        case 3:
          cantidad = "10 centimos";
          break;
        case 4:
          cantidad = "20 centimos";
          break;
        case 5:
          cantidad = "50 centimos";
          break;
        case 6:
          cantidad = "1 euro";
          break;
        case 7:
          cantidad = "2 euros";
        default:
      }
      k=(int)(Math.random()*2);
      switch(k) {
        case 0:
          cara = "cara";
          break;
        case 1:
          cara = "cruz";
          break;
        default:
      }
      
      System.out.println(cantidad+"==="+cara);
    }
	}
}

