package Ejercicio2;

public abstract class Vehiculo {
  
    private static int kilometrosTotales = 0;
    private static int vehiculosNuevos = 0;
    

    private int kilometrosRecorridos;
    
    public Vehiculo() {
      this.kilometrosRecorridos = 0;
      Vehiculo.vehiculosNuevos++;
    }
  
    public int getKilometrosRecorridos() {
      return this.kilometrosRecorridos;
    }
    
    public static int getKilometrosTotales() {
      return Vehiculo.kilometrosTotales;
    }
  

    public void distancia(int d) {
      this.kilometrosRecorridos +=d;
      Vehiculo.kilometrosTotales +=d;
    }
    
  }