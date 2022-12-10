import java.util.Scanner;	
/*
 * Alejandro Moreno Garrido
Calcular potencia
 */

public class Potencia {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    System.out.print("Introduce la base: ");
    int base = s.nextInt();    
    System.out.print("Introduce el exponente: ");
    int exponente = s.nextInt();
    int total=1;

		if (exponente>0){
      for (int i=0;i<exponente;i++) {
        total= base * total;
			}       
    } 
    if (exponente<0) {
      for (int i = 0; i < exponente; i++) {
        total= base* total;				
			}
			total=1/total;
		}
    if(exponente==0){
			total=1;
		}
		System.out.println("resultado= "+total);
	}
}
