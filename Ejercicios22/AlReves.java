import java.util.Scanner;
/*
Alejandro Moreno Garrido
 */
public class AlReves {

  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
    System.out.print("Introduce un numero : ");
    int num =s.nextInt();	

    int calcu=num;
    int alReves=0;
    
    while (calcu > 0) {
      alReves = (alReves * 10) + (calcu % 10);
      calcu /= 10;
    } 
    
    System.out.println("Al reves: " + alReves);
  }
}
