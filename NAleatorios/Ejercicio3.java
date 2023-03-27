/*
Alejandro Moreno Garrido
* Baraja española 
 */


public class Ejercicio3 {
	
	public static void main (String[] args) {
		String palo = "";
    String numero = "";
    
    int valorPalo = (int)(Math.random()*4) + 1;
    int cartita = (int)(Math.random()*11) + 1;
    
    
    switch(valorPalo) {
      case 1:
        palo = "espadas";
        break;
      case 2:
        palo = "oros";
        break;
      case 3:
        palo = "bastos";
        break;
      case 4:
        palo = "copas";
      default:
    }
    
    switch(cartita) {
      case 1:
        numero = "As";
        break;
      case 11:
        numero = "Sota";
        break;
      case 12:
        numero = "Caballo";
        break;
      case 13:
        numero = "Rey";
        break;
      default:
      numero = String.valueOf(cartita);	
    }
     
    System.out.println(numero + " de " + palo);
    
	}
}

