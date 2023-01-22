/*
Alejandro Moreno Garrido
 */

public class Ejercicio11Bidi {
	
	public static void main (String[] args) {
		int tamFilas=10, tamColumnas=10,min=0,max=0;
		double suma=0,media=0;
		int [][]num = new int [tamFilas][tamColumnas];
		int [] diagonal= new int [tamFilas];
		System.out.println("El array original es");
		
		for(int i=0;i<tamFilas;i++){
			for(int j=0;j<tamColumnas;j++){
				num[i][j]=(int)(Math.random()*101+200);
				System.out.print(num[i][j]);
				if(i==j){
					diagonal[i]=num[i][j];
					suma+=diagonal[i];
					if(i==1){
						min=diagonal[i];
						max=diagonal[i];
					} else if(diagonal[i]>min){
						 	min=diagonal[i];
						} else if(diagonal[i]>max){
							max=diagonal[i];
							}
				}
			}
			System.out.println();
	  }
	  System.out.println("los elementos de la diagonal son:");
	  for(int i=0;i<tamFilas;i++){
			System.out.print(diagonal[i]);
		}
		media=suma/tamFilas;
		System.out.println("minimo:" +min+"   maximo:" +max+ "     y media:"+media);
	}
}

