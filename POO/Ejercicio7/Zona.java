package Ejercicio7;

public class Zona {
  
    private int getEntradasRestantes;
    
    public Zona(int n){
      getEntradasRestantes = n;
    }
    
    public int getEntradasRestantes() {
      return getEntradasRestantes;
    }

    
    public void vender(int n) {
      
      if (this.getEntradasRestantes == 0) {
        System.out.println("Acabo de verder la ultima entrada");
      } else if (this.getEntradasRestantes < n) {
        System.out.println("tengo " + this.getEntradasRestantes
                            + " entradas");
      }
      
      if (this.getEntradasRestantes >= n) {
        getEntradasRestantes -= n;
        System.out.println("Toma tus " + n + " entradas");
      }
    }
  }