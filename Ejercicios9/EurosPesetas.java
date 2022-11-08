
//Alejandro Moreno Garrido
//Conversor de euros a pesetas

public class EurosPesetas {
	
	public static void main (String[] args) {
		String N1;
			System.out.print("Por favor, introduce un número: ");
			N1 = System.console().readLine();
				double euros;
					euros = Integer.parseInt( N1 );
			
		double pesetas= euros*160;
			System.out.print(N1+"euros, son: "+ pesetas+" pesetas");
		
	}
}

