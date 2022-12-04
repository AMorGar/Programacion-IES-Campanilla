/*
Alejandro Moreno Garrido
* Te dice la calificacion del alumno
 */
public class Calificacion {
  public static void main(String[] args) {

    System.out.print("Nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());    
    double media = (nota1+nota2)/2; 
//si tiene menos de un 5 de media, debe ir a recuperacion  
    if (media<5) {
      System.out.print("Indica resultado de la recuperacion : ");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }  
//Tu nota final 
    System.out.print("Tu nota es : " +media);
  }
}
