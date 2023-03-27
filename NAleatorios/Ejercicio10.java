/*
Alejandro Moreno Garrido
* cadena de caracteres
 */


public class Ejercicio10 {
	
	public static void main (String[] args) {
		int n;
		String dentro = " ";
    int cadTamano; 
    for(int g=1;g<=10;g++) {
      
      cadTamano = (int)(Math.random()*41)+1;
      n = (int)(Math.random()*6);
      
      switch(n) {
        case 0:
          dentro = "*";
          for(int i=1;i<=cadTamano;i++) {
						System.out.print(dentro);
					}
          break;
        case 1:
          dentro = "-";
          for(int i=1;i<=cadTamano;i++) {
						System.out.print(dentro);
					}
          break;
        case 2:
          dentro = "@";
          for(int i=1;i<=cadTamano;i++) {
						System.out.print(dentro);
					}
          break;
        
        case 3:
          dentro = ".";
          for(int i=1;i<=cadTamano;i++) {
						System.out.print(dentro);
					}
          break;
        case 4:
          dentro = "|";
          for(int i=1;i<=cadTamano;i++) {
						System.out.print(dentro);
					}
          break;
        case 5:
          dentro = "=";
          for(int i=1;i<=cadTamano;i++) {
						System.out.print(dentro);
					}
          break;

        default:
      }
			System.out.println();
    }
	}
}

