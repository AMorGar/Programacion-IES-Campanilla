package Ejercicio3;

public class Lagarto extends Animal {

    public Lagarto() {}
  
    public Lagarto(Sexo s) {
      super(s);
    }
  
    public void salta() {
      System.out.println("Pega un salto hasta el sol");
    }
  
    public void entierrate() {
      System.out.println("Se mete en un agujero en la tierra");
    }
  
    public void escondete() {
      System.out.println("Me escuendo");
    }
  }