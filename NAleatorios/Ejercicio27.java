import java.util.Scanner;
/*
Alejandro Moreno Garrido
* piedra papel tijera 
 */


public class Ejercicio27 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Elige: ");
    String eleccion = s.nextLine();
		int n = ((int)(Math.random()*3)+1);
    String sol = " ";
    boolean resultado = false;
    switch (n) {
      case 1:
        sol = "piedra";
        break;
      case 2:
        sol = "tijera";
        break;
      case 3:
        sol = "papel";
        break;
      default:
    }    
    if (eleccion!=sol) {
			switch (eleccion) {
				case "piedra":
					if (sol=="tijera") {
						resultado = true;
					}
					break;
				case "tijera":
					if (sol=="papel") {
						resultado = true;
					}
					break;
				case "papel":
					if (sol=="piedra") {
						resultado = true;
					}
					break;
					default:
				}
			}				
      if (resultado==true) {
        System.out.println("ganaste");
      } else {
        System.out.println("perdiste");
      }
      
    }
	}


