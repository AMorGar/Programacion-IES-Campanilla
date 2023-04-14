package excepciones.Entrega2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProbarExcepciones {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int eleccion = 0;
    do {
      System.out.println("Menu:");
      System.out.println("1. Provocar StackOverFlowError");
      System.out.println("2. Provocar NumberFormatException");
      System.out.println("3. Provocar ArrayIndexOutOfBoundsException");
      System.out.println("4. Provocar FileNotFoundException");
      System.out.println("5. Provocar ArithmeticException");
      System.out.println("0. Salir");
      System.out.print("Seleccione una opcion: ");
      eleccion = s.nextInt();
      try {
      switch (eleccion) {
        case 1:

            overflow(10);

          break;
        case 2:

            number();

          break;
        case 3:

            array();
 
          break;
        case 4:

            file();

          break;
        case 5:

            arithmetic(30);
          break;
        case 0:
          System.out.println("Saliendo del programa");
          break;
        default:
          System.out.println("Opcion invalida");
          break;
      }
    }
      catch (StackOverflowError e) {

        System.out.println("StackOverFlowError");
      }

      catch (NumberFormatException e) {

        System.out.println("NumberFormatException");
      }

      catch (ArrayIndexOutOfBoundsException e) {

        System.out.println("ArrayIndexOutOfBoundsException");
      }

      catch (FileNotFoundException e) {

        System.out.println("FileNotFoundException");
      }

      catch (ArithmeticException e) {

        System.out.println("ArithmeticException");
      }
    }while (eleccion != 0);
  

  }

  public static int overflow(int n) {

    return n * overflow(n);
  }

  public static void number() {
    String letra = "abc";
    int n = Integer.parseInt(letra);
  }

  public static void array() {
    int[] array = new int[3];
    System.out.println(array[3]);
  }

  public static void file() throws FileNotFoundException {
    File archivo = new File("PabloApruebamePorfa.txt");
    Scanner s = new Scanner(archivo);
  }

  public static int arithmetic(int n) {
    return n / 0;
  }

}