import java.util.Scanner;
/*
Alejandro Moreno Garrido
 */


public class Ejercicio14{
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String[] n = new String[8];
    String[] par = new String[8];
    String[] colores = new String[8];
    int pares = 0;
    int color= 0;
    
    for (int i = 0; i < 8; i++) {
      n[i] = s.nextLine();
      if (n[i] == "verde") {
        colores[color] = n[i];
        color++;
      } else if(n[i] == "rojo"){
        colores[color] = n[i];
        color++;
      }
      else if(n[i] == "azul"){
        colores[color] = n[i];
        color++;
      }
      else if(n[i] == "amarilla"){
        colores[color] = n[i];
        color++;
      }
       else if(n[i] == "naranja"){
        colores[color] = n[i];
        color++;
      }
       else if(n[i] == "rosa"){
        colores[color] = n[i];
        color++;
      }
       else if(n[i] == "negro"){
        colores[color] = n[i];
        color++;
      }
       else if(n[i] == "blanco"){
        colores[color] = n[i];
        color++;
      }
       else if(n[i] == "morado"){
        colores[color] = n[i];
        color++;
      }
      
    }   
    for ( int j = 0; j < pares; j++) {
      n[j] = par[j];
    }    
    for (int k = pares; k < 8; k++) {
      n[k] = colores[k - color];
    }
    for (int g = 0; g < 8; g++) {
      System.out.print(n[g] +" ");
    }
    System.out.println(" ");

    System.out.println("---------------------------------------------------------");
    for (int h = 0; h < 8;h++) {
      System.out.print(n[h] +" ");
    }
	}
}

