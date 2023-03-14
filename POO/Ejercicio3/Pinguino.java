package Ejercicio3;

public class Pinguino extends Ave {

    public Pinguino() {}
  
    public Pinguino(Sexo s) {
      super(s);
    }
  
    public void vuela() {
      System.out.println("SVuelo menos que un dodo");
    }
  
    public void programa() {
      System.out.println("Llevo picando codigo 5 horas, ayuda");
    }
  
    public void cantar() {
      System.out.println("Wish wish u a merry christmas");
    }
  }