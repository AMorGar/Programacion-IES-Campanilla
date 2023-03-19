/*
 * Este programa crea un array con gatitos en los que se guardan sus datos y posteriormente se calcula si pueden haber comido sardinas o no.
 * 
 * Alejandro Morneo Garrido
 */

package Ejercicio2;


public class ArrayDeGatos02 {
    public static void main(String[] args) {
//Se declara el array que guardara los datos de los gatos
      Gato[] gato = new Gato[4];
      gato[0] = new Gato("Garfield", "naranja", "mestizo",3);
      gato[1] = new Gato("Pepe", "gris", "angora",2);
      gato[2] = new Gato("Mauri", "blanco", "manx",1);
      gato[3] = new Gato("Ulises", "marrón", "persa",5);
  
      System.out.println("Datos de los gatos:");
//Imprime los datos de los gatos 1 a 1      
      for (int i = 0; i < 4; i++) {
        System.out.println("\nGato nº" + (i + 1));
        System.out.println("Nombre: " + gato[i].getNombre() );
        System.out.println("Color: " + gato[i].getColor());
        System.out.println("Raza: " + gato[i].getRaza());
        System.out.println( gato[i].getsardinas());
      }
    }
  }