import java.util.Scanner;
/*
Alejandro Moreno Garrido
* Caja fuerte
 */


public class CajaFuerte {
	
  public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	int a=1;
	int b=2;
	int c=3;
	int d=4;
	for(int i=0;i<4;i++){
	  int cont=4-i;
	  System.out.println("Introduzca la clave de la caja fuerte(tienes "+cont+" intentos antes de que explote): ");
	  System.out.println("Introduce el primer numero: ");  
	  int test1 =s.nextInt();
	  System.out.println("Introduce el segundo numero: ");
	  int test2 =s.nextInt();
	  System.out.println("Introduce el tercero numero: ");
	  int test3 =s.nextInt();
	  System.out.println("Introduce el cuarto numero: ");
	  int test4 =s.nextInt();
	  
	  if((a==test1)&&(b==test2)&&(c==test3)&&(d==test4)){
	    System.out.println("has conseguido abrir la caja fuerte");  
	    i = 4; 
	  } else {
		System.out.println("No se abre ");
		}
    }
  }  
}
