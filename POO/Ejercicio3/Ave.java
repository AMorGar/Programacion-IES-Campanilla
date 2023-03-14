package Ejercicio3;

public class Ave extends Animal {
  
    public Ave() {
      super(Sexo.HEMBRA);
    }
  
    public Ave(Sexo s) {
      super(s);
    }
    
    public void ponHuevo() {
      if (this.getSexo() == Sexo.MACHO) {
        System.out.println("NO puedo hacer tortilla");
      } else {
        System.out.println("Ya tenemos material para la tortilla");
      }
    }
    
    public void limpiate() {
      System.out.println("*Se ducha en la fuente*");
    }
    
    public void construyeNido() {
      System.out.println("Construye un nido");
    }
  }