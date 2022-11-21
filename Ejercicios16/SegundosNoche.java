/*
Alejandro Moreno Garrido
* Segundos para media noche
 */
public class SegundosNoche {

  public static void main(String[] args) {
    

    
    System.out.print("Escriba la hora: ");
    int h = Integer.parseInt(System.console().readLine());  
    
    System.out.print("escriba los minuto: ");
    int m = Integer.parseInt(System.console().readLine());

    int seg = (h * 3600) + (m * 60);
    int segundosHastaMedianoche = (24 * 3600) - seg;
            
   
    System.out.printf("Quedan "+ segundosHastaMedianoche+" segundos para media noche");
  }
}
