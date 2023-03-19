package Ejercicio2;

public class Gato {
//Declara las variables privadas de gato(atributos privados)
    private String nombre;
    private String color;
    private String raza;
    private int sardinas;
    private int total=10;
    

//Constructor de la clase gato la cual asigna a las variables sus respectivos valores
    public Gato(String nombre, String color, String raza,int sardinas) {
      this.nombre = nombre;
      this.color = color;
      this.raza = raza;
      this.sardinas = sardinas;
    }
    
//declaramos las funciones geter y seter 
    public String getNombre() {
      return nombre;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
  
    public String getColor() {
      return color;
    }
  
    public void setColor(String color) {
      this.color = color;
    }
  
    public String getRaza() {
      return raza;
    }
  
    public void setRazas(String raza) {
      this.raza = raza;
    }
//funciones encargadas de las sardinas
    public int getsardinas() {
      return sardinas;
    }
  
    public void setsardinas(int n) {
      if (n<total){ 
        System.out.println("Las sardinas estaban buenisimas");
        total = total-n;
      }else{
        System.out.println("Me he quedado sin sardinas");
      }
    }
    
  }
  