/*
Alejandro Moreno Garrido
* Calcula minutos para el fin de semana
 */
public class MinutosFinde {
  public static void main(String[] args) {

    System.out.print("Introduce el dia de la semana : ");
    String dia = System.console().readLine();
//declaramos la variable dia=0 para que pueda calcualr los minutos finales
    int dias=0;
    switch(dia) {
      case "lunes":
        dias = 0;
        break;
      case "martes":
        dias = 1;
        break;
      case "miércoles":
        dias = 2;
        break;
      case "jueves":
        dias = 3;
        break;
      case "viernes":
        dias = 4;
        break;
      default:
        System.out.print("Dia erroneo.");
    }    
//Pedir minutos y horas
    System.out.print("Di la hora: ");
    int h = Integer.parseInt(System.console().readLine());   
    System.out.print("Di los minutos: ");
    int m = Integer.parseInt(System.console().readLine());
//Calculos para pasar a minutos
    int mfinales = (dias*24*60)+(h*60)+ m;
    int mtotales = (4*24*60)+(15*60);  
    int ultimo= mtotales-mfinales;
//Resultados
    System.out.print(ultimo+ " minutos para el fin de semana.");
  }
}
