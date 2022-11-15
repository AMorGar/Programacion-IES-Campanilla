import java.util.Scanner;
/*
 
 */


public class Notas {
	
  public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.print("Introduzca la primera nota: ");
	double n1 = s.nextDouble();
	System.out.print("Introduzca la nota que desea alcanzar: ");
	double n2 = s.nextDouble();
	double total,diferencia, media;
	media=n1*0.4;
	diferencia= media - 1;
	total= diferencia*10;
	
	System.out.printf("debe sacar un: "+total);
	
	}
}

