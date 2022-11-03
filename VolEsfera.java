/*Este programa se encarga de carcular el volumen de una esfera.
 Alejandro Moreno Garrido*/ 

public class VolEsfera {
	
	public static void main (String[] args) {
//declaramos las variables constantes//
		final double pi = 3.14;
			final double R = 8.75;
//declaramos las variables que seran las encargadas de realizar los calculos//	
		double vol,A;
//realizamos los calculos//
	A=R*R*R;
	vol=(4/3)*pi*A;
//imprimimos en pantalla//
		System.out.println("El volumen de la esfera es= "+vol);
		

}
}

