import java.util.Scanner;
/*
Alejandro Moreno Garrido
* cuba rellena
 */
public class Ejercicio20 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Indice el tamaño de la cuba: ");
    int volumen = s.nextInt();
    int n = (int)(Math.random()*volumen);
    int relleno= volumen-n;    
    for (int i=0;i<volumen;i++) {
			
      if (i<relleno) {
        System.out.println("#    #");
      } else {
        System.out.println("#----#");
      }
    }       
    System.out.println("######");
    
    System.out.println("volumen: " + volumen);
    System.out.println("Puede llevar: " + n);
	}
}

