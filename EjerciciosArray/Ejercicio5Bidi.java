/*
Alejandro Moreno Garrido
 */

public class Ejercicio5Bidi {
  public static void main(String[] args) {
    final int filas = 6;
    final int columnas = 10;
    int[] maximo = new int[2];
    int[] minimo = new int[2];
    int[][] n = new int[filas][columnas];
    System.out.printf("%10s ","Array n");
    for(int i=0;i<columnas;i++){
      System.out.printf("%10s ","Columna " + i);
    }
    System.out.println(" ");
    for(int i=0;i<filas;i++){
      System.out.printf("%10s ","Fila " + i);
      for(int j=0;j<columnas;j++){
        n[i][j] = (int)(Math.random()*1001);
        System.out.printf("%10s ",n[i][j]);
        if(n[i][j]<n[minimo[0]][minimo[1]]){
          minimo[0]= i;
          minimo[1]= j;          
        }
        if(n[i][j]>n[maximo[0]][maximo[1]]){
          maximo[0]= i;
          maximo[1]= j;          
        }
      }
      System.out.println(" ");
    }
    System.out.println("Valor mínimo: " + n[minimo[0]][minimo[1]] + ", y posicion: [" + minimo[0] + "][" + minimo[1] + "]");
    System.out.println("Valor máximo: " + n[maximo[0]][maximo[1]] + ", y posicion [" + maximo[0] + "][" + maximo[1] + "]");

  }
  
}
