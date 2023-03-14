package Ejercicio3;

public abstract class Mamifero extends Animal {

    public Mamifero () {
      super();
    }
  
    public Mamifero (Sexo s) {
      super(s);
    }
  
    public void amamanta() {
      if (this.getSexo() == Sexo.MACHO) {
        System.out.println("Yo soy el papa");
      } else {
        System.out.println("yo soy la mama");
      }
    }
    
    public void cuidaCrias() {
      System.out.println("Estoy cuidando mis crias");
    }
    
    public void anda() {
      System.out.println("Uso las piernitas");
    }
  }