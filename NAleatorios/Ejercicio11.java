/*
Alejandro Moreno Garrido
* cadena de notas
 */


public class Ejercicio11 {
	
	public static void main (String[] args) {
		int n;
		int sobre = 0;
		int notables = 0;
		int bienes = 0;
		int sufi = 0;
    int suspensos = 0;

    for(int i=0;i<20;i++) {
      
      n =(int)(Math.random()*5);
      
      switch(n) {
				case 0:
          System.out.print("sobresaliente ");
          sobre++;
          break;
        case 1:
          System.out.print("notable ");
          notables++;
          break;
        case 2:
          System.out.print("bien ");
          bienes++;
          break;
        case 3:
          System.out.print("suficiente ");
          sufi++;
          break;
        case 4:
          System.out.print("suspenso ");
          suspensos++;
          break;
			default:
      }
    }
    System.out.println("Numero sobresalientes: " + sobre);
    System.out.println("Numero notables: " + notables);
    System.out.println("Numero bienes: " + bienes);
    System.out.println("Numero suficientes: " + sufi);
    System.out.println("Numero suspensos: " + suspensos);
    
    
    
    
	}
}

