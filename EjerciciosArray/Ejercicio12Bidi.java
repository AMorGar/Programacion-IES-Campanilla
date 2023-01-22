/*
Alejandro Moreno Garrido
 */

public class Ejercicio12Bidi {
  public static void main(String[] args) {
    int max = 500;
    int min = 900;
    int total = 0;
    int[][] n = new int[9][9];
    System.out.printf("%10s  ","Array n");
    for(int i=0;i<9;i++){
      System.out.printf("%10s  ","Columna " + i);
    }
    System.out.println();
    for(int i=0;i<9;i++){
      System.out.printf("%10s  ","Fila " + i);
      for(int j=0;j<9;j++){
        n[i][j] = (int)(Math.random()*401 + 500);
        System.out.printf("%10s  ",n[i][j]);
        if(i+j==8){
          if(n[i][j]<min){
            min = n[i][j];
          }
          if(n[i][j]>max){
            max = n[i][j];
          }
          total += n[i][j];
        }
      }
      System.out.println(" ");
    }
    System.out.println("Diagonal: ");
    for(int i=0;i<9;i++){
      System.out.print(n[8-i][i] + " ");
    }
    System.out.println("\nValor mínimo: " + min);
    System.out.println("Valor máximo: " + max);
    System.out.println("La media es: " + total/9);

  }

}

