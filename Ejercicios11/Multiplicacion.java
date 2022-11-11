import java.util.Scanner;
/*Alejandro Moreno Garrido
Conversor de euros a pesetas
 */
public class Multiplicacion {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Introduce el primer numero ");
double n1 = Integer.parseInt(s.nextLine());
System.out.print("Introduce el segundo numero: ");
double n2 = Integer.parseInt(s.nextLine());

double sol=n1*n2;
System.out.println("La solucion es:  " + sol);
}
}
