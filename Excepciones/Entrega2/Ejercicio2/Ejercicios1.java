package excepciones.Entrega2;

import java.util.Scanner;

public class Ejercicios1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean Test= true;
    int min=0;
    do{
    try{
    System.out.println("Introduce numeros enteros");
    min = s.nextInt();
    for(int i=0; i<=5;i++){
    System.out.println("Introduce numeros enteros");
    int num = s.nextInt();
        if(num<min){
            min=num;
        }
    }

    }
    catch(Exception e){
        System.out.println("Era un numero entero,GENIO");
        Test=false;
        s.next();
        
    }
}while(Test!=true);

    System.out.println("el minimo es= "+ min);
}
}