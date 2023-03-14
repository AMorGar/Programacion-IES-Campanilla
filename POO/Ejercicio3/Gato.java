package Ejercicio3;

public class Gato extends Mamifero {
  
    private String raza;
  
    public Gato (Sexo s, String r) {
      super(s);
      this.raza = r;
    }
    
    public Gato (Sexo s) {
      super(s);
      this.raza = "pokemon";
    }
  
    public Gato (String r) {
      super(Sexo.HEMBRA);
      this.raza = r;
    }
    
    public Gato () {
      super(Sexo.HEMBRA);
      raza = "pokemon";
    }
    
    public void maulla() {
      System.out.println("Miauuuu");
    }
    
    public void ronronea() {
      System.out.println("grrrrrrr");
    }
    
    public void limpiate() {
      System.out.println("Me estoy lamiendo");
    }
    
    public void caza() {
      System.out.println("Estoy cazando ratones");
    }
  }