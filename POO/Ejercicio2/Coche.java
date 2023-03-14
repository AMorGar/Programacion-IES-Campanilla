package Ejercicio2;

public class Coche extends Vehiculo {

    private int marca;
  
    public Coche(int m) {
      super();
      this.marca = m;
    }
  
    public void quemaRueda() {
      System.out.println("*Se le rompe la rueda*");
    }
  }