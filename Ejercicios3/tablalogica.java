
//Alejandro Moreno Garrido
//Estre programa realiza unos calculos lógicos del ejercicio2

public class tablalogica {
	
	public static void main (String[] args) {
//Declaramos variables		
		int entero1=5,entero2=7,num;
		boolean respuesta;
//tabla				
		respuesta=(entero1>5)&&(entero2+3<10);
		System.out.println("(entero1>5)&&(entero2+3<10)-->" + respuesta);
		respuesta=(10!=entero1+5)||(20>(entero2+5)*entero1+5);
		System.out.println("respuesta=(10!=entero1+5)||(20>(entero2+5)*entero1+5)-->" + respuesta);
		num=entero1*entero2+10+4/2-2*4+2;
		System.out.println("entero1*entero2+10+4/2-2*4+2-->" + num);
		respuesta=(10/2-1==entero1)&&(20<entero2+13);
		System.out.println("(10/2-1=entero1)&&(20<entero2+13)-->" + respuesta);
		respuesta=5-2>4 && !(5==25/5); 
		System.out.println("5-2>4&& not 5==25/5-->" + respuesta);
		respuesta="J"=="J"||"S"=="s";
		System.out.println("''J''==''J''||''S''==''s''-->" + respuesta);
		respuesta=4*2<=8||2*2<5&&4>3+1;
		System.out.println("4*2<=8||2*2<5&&4>3+1-->" + respuesta);
		respuesta=10+4<15-3||2*5+1>14-2*2;
		System.out.println("10+4<15-3||2*5+1>14-2*2-->" + respuesta);
	}
}

