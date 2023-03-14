package Ejercicio3;

public class PruebaAnimales {

    public static void main(String[] args) {
      Pinguino pingu = new Pinguino(Sexo.MACHO);
      pingu.come("palomitas");
      pingu.programa();
      
      Perro flufy = new Perro(Sexo.HEMBRA);
      flufy.duerme();
      flufy.persigueLaCola();
      flufy.cuidaCrias();
      
      Lagarto lagatijo = new Lagarto(Sexo.MACHO);
      lagatijo.escondete();
      lagatijo.entierrate();
    }
  }