/*
Alejandro Moreno Garrido
 */

public class Ejercicio13Bidi {
  public static void main(String[] args) {
    String[] pais = {"España", "Rusia", "Japón","Australia"};
    int suma = 0;
    int maximo = 140;
    int minimo = 210;
    int[][] tamaño = new int[4][10];
    System.out.printf("%10s  "," ");
    for(int i=0;i<10;i++){
      System.out.printf("%5s  "," ");
    }
    System.out.printf("  %5s  ","Media");
    System.out.printf(" %5s  ","Minimo");
    System.out.printf(" %5s  ","Maximo");
    System.out.println();
    for(int i=0;i<4;i++){
      System.out.printf("%10s:",pais[i]);
      for(int j=0;j<10;j++){
        tamaño[i][j]= (int)(Math.random()*71+140);
        System.out.printf("%5s ",tamaño[i][j]);
          if(tamaño[i][j]<minimo){
            minimo= tamaño[i][j];
          }
          if(tamaño[i][j]>maximo){
            maximo= tamaño[i][j];
          }
          suma += tamaño[i][j];
      }
      System.out.printf("| %5s   ",suma/10);
      System.out.printf("%5s   ",minimo);
      System.out.printf("%5s   ",maximo);
      System.out.println(" ");
 //reseteamos variables
      suma= 0;
      maximo= 140;
      minimo= 210;
    }
  }

}
