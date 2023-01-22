
/*
Alejandro Moreno Garrido
 */


public class Ejercicio3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String[] n = new String[11];
		String num;
		for (int i = 10; i >= 0; i--) {
			System.out.println("introduce un numero");
			num = s.nextLine();
			n[i] = num;	
    }
		for (int g = 0; g <=10; g++) {
      System.out.println(n[g]);
    }
	}
}

