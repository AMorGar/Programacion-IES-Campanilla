import java.util.Scanner;
/*
Alejandro Moreno Garrido
* Piramide hueca
 */
public class PiramideHueca {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int num= s.nextInt();
    System.out.print("Introduce el caracter : ");
    String relleno = System.console().readLine();
//Restarle 1 al numero para hacer una bucle a aparte para la piramide
    int huecoFuera = num - 1;
    int huecoDentro = 0;
    int altura = 1;
    for (int g=1;g < num;g++) { 
//huecos de fuera      
			for (int k = 1; k <= huecoFuera;k++) {
        System.out.print(" ");
      }    
      System.out.print(relleno);
//huecos de dentro
      for (int h= 1; h < huecoDentro;h++) {
        System.out.print(" ");
      } 
//Medir altura     
      if (altura>1) {
        System.out.print(relleno);
      }      
      System.out.println(); 
//restar de uno en uno para que se vea escalonado
			huecoFuera--;
//sumar de 2 en dos porque es una piramide
      huecoDentro=huecoDentro+2;
//para que la piramide cuente la ultima fila como valida, sino ignoraria la mitad
      altura++;
    }
//parte de abajo       
    for (int i=1;i<altura*2;i++) {
      System.out.print(relleno);
    }
}
}
