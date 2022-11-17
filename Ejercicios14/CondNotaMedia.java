
import java.util.Scanner;
/*
*Alejandro Moreno Garrido
*notas media indicando las palabras que salen en el boletin 
 */


public class CondNotaMedia {
	
  public static void main (String[] args) {


	Scanner s = new Scanner(System.in);
	System.out.print("Introduzca la primera nota: ");
	double n1 = s.nextDouble();
	System.out.print("Introduzca la segunda nota: ");
	double n2 = s.nextDouble();
	System.out.print("Introduzca la tercera nota: ");
	double n3 = s.nextDouble();
	
	double media= (n1+n2+n3)/ 3;
	

	if ((media>=0) && (media<5)){
	  System.out.print("insuficiente");
	} else if((media<=5) && (media<6)){
	  System.out.println("suficiente");
	} else if((media<=6) && (media<7)){
	  System.out.println("bien");
	} else if ((media>=7) && (media<9)){
	  System.out.println("notable");
	} else if ((media>=9) && (media<=10)){
	  System.out.println("Sobresalente");
	} else{
	  System.out.print("Te has equivocado introduciendo numeros");
	}
	
				
	}
}

