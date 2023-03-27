/*
Alejandro Moreno Garrido 
* baraja francesa
 */


public class Ejercicio2 {
	
	public static void main (String[] args) {
		String palo = "";
    String numero = "";
    
    int valorPalo = (int)(Math.random()*4) + 1;
    int cartita = (int)(Math.random()*13) + 1;
    
    
    switch(valorPalo) {
      case 1:
        palo = "picas";
        break;
      case 2:
        palo = "corazones";
        break;
      case 3:
        palo = "diamantes";
        break;
      case 4:
        palo = "tréboles";
      default:
    }
    
    switch(cartita) {
      case 1:
        numero = "As";
        break;
      case 11:
        numero = "J";
        break;
      case 12:
        numero = "Q";
        break;
      case 13:
        numero = "K";
        break;
      default:
      numero = String.valueOf(cartita);	
    }
     
    System.out.println(numero + " de " + palo);
    
	}
}

