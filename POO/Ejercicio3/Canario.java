package Ejercicio3;

public class Canario extends Ave {

    public Canario() {}
    
    public Canario(Sexo s) {
      super(s);
    }
  
    public void canta() {
      System.out.println("I beliiive i can flyyyyy");
    }
  
    public void construir() {
      System.out.println("fabricar una casa");
    }
  
    public void pia() {
      System.out.println("Pio pio pio");
    }
  }