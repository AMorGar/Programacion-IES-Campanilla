package Ejercicio3;

public class Perro extends Mamifero {

    public Perro (Sexo s) {
      super(s);
    }
  
    public Perro () {
      super(Sexo.HEMBRA);
    }
  
    public void ladra() {
      System.out.println("Guau guau");
    }
  
    public void persigueLaCola() {
      System.out.println("Se muerde la cola");
    }
  
    public void rascarse() {
      System.out.println("Tengo pulgas");
    }
  }