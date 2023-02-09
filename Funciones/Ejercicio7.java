
import misFunciones.Matematicas;
import java.util.Scanner;
/*
Alejandro moreno garrido
 */


public class Ejercicio7 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el lado: ");
    double x =s.nextDouble();
    System.out.print("Introduce la altura: ");
    double y =s.nextDouble(); 
    System.out.print("el perimetro es: "+ misFunciones.Matematicas.perimetroRectangulo(x,y));
    System.out.print("el area es: "+ misFunciones.Matematicas.areaRectangulo(x,y));
    
    
	}
}


