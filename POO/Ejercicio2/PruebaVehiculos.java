package Ejercicio2;
import java.util.Scanner;

public class PruebaVehiculos {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int opcion = 0;
      int distancia;
      Bicicleta et = new Bicicleta(9);
      Coche rayo = new Coche(1900);
      while (opcion != 8) {
        System.out.println("\n1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.println("Elige una opción (1-8): ");
        
        opcion = s.nextInt();
        
        switch (opcion) {
          case 1:
            System.out.println("Indique la distancia");
            distancia = s.nextInt();
            et.distancia(distancia);
            break;
          case 2:
            et.hazCaballito();
            break;
          case 3:
            System.out.println("Indique la distancia");
            distancia = s.nextInt();
            rayo.distancia(distancia);
            break;
          case 4:
            rayo.quemaRueda();
            break;
          case 5:
            System.out.print("Distancia recorrida por la bicicleta: ");
            System.out.println(et.getKilometrosRecorridos() + " Kilometros");
            break;
          case 6:
            System.out.print("Distancia recorrida por el coche: ");
            System.out.println(rayo.getKilometrosRecorridos() + " Kilometros");
            break;
          case 7:
            System.out.print("Los vehículos llevan recorridos ");
            System.out.println(Vehiculo.getKilometrosTotales() + " Kilometros");
          default:
        } 
      } 
    }
  }