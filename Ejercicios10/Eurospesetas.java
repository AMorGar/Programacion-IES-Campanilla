
/*Alejandro Moreno Garrido
Conversor de pesetas a euros*/

public class Eurospesetas {
	
	public static void main (String[] args) {
		String N1;
			System.out.print("Por favor, introduce un número: ");
		N1 = System.console().readLine();
		double euros;
			euros = Integer.parseInt( N1 );
			
		int pesetas= euros*160;
			System.out.print(N1+"euros, son: "+ pesetas+" pesetas");
		
	}
}

