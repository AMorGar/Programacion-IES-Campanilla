import java.util.Scanner;
/*
 *Alejandro Moreno Garrido
 * Estaciones del año
 */


public class EstacionesAno
{

  public static void main (String[] args){
	Scanner s = new Scanner(System.in);
	System.out.print("Por favor introduzca el numero de mes del año: ");
	int m = s.nextInt();
	int test= 5;
	if ((m>=3) && (m<=6)){

	  test =1;
	} else if ((m>=7) && (m<=9)){

	  test=2;
	} else if ((m>=10) && (m<=12)){

	  test=3;
	} else if ((m>=1) && (m<=2)){

	  test=4;
	} else{
	  test=6;
	}
	
	String Estacion;
	switch (test)
	{
	case 1:
	  System.out.print("Es primavera");
	  break;
	case 2:
	  System.out.print("Es verano");
	  break;
	case 3:
	  System.out.print("Es otoño");
	  break;
	case 4:
	  System.out.print("es invierno");
	  break;
	default:
	  System.out.print("ese dia no existe");
	}
}
}

