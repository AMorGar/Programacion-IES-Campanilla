/*Este progrmama representa una tabla que aparece en el ejercicio 1*/
//Alejandro Moreno Garrido


public class Tabla {
	
	public static void main (String[] args) {
//declaramos variables
		int a=1,b=2,c=3;
		
//tabla		
	a=b;
	System.out.println("a=b--> "+a+" "+b+" "+c);	
	c=a;
	System.out.println("c=a--> "+a+" "+b+" "+c);	
	b=(a+b+c)/2;	
	System.out.println("b=(a+b+c)/2--> "+a+" "+b+" "+c);
	a=a+c*2;
	System.out.println("a=a+c*2--> "+a+" "+b+" "+c);
	c=b-a;
	System.out.println("c=b-a--> "+a+" "+b+" "+c);
	a=b*c;
	System.out.println("a=b*c--> "+a+" "+b+" "+c);
	b=a+b*2;
	System.out.println("b=a+b*2--> "+a+" "+b+" "+c);
	c=c-2;
	System.out.println("c=c-2--> "+a+" "+b+" "+c);
	a=b;
	System.out.println("a=b--> "+a+" "+b+" "+c);
	c=a/b;
	System.out.println("a/b--> "+a+" "+b+" "+c);
	
	
	
	}
}

