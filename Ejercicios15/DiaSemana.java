
import java.util.Scanner;
/*
* Alejandro Moreno Garrido
*
Dice el dia de la semana que es
*/
public class DiaSemana {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Por favor introduzca el numero del dia de la semana: ");
	int n = s.nextInt();
	String DiaSemana;
	switch (n) {
	case 1:
	DiaSemana = "Lunes";
	break;
	case 2:
	DiaSemana = "Martes";
	break;
	case 3:
	DiaSemana = "Miercoles";
	break;
	case 4:
	DiaSemana = "Jueves";
	break;
	case 5:
	DiaSemana = "Viernes";
	break;
	case 6:
	DiaSemana = "Sabado";
	break;
	case 7:
	DiaSemana = "Domingo";
	break;
	default:
	DiaSemana = "no existe ese dia";
}
	System.out.println("Dia " + n + "= " + DiaSemana);
}
}

