import java.util.Scanner;
/*
Biblioteca de funciones
* Alejandro Moreno Garrido
 */


public class Bibliotecas {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    System.out.print("Introduce el numero: ");
    long n =s.nextInt(); 
    
    if (esCapicua(n)) {
      System.out.println("El numero es capicua.");
    } else {
      System.out.println("El numero  no es capicua.");
    }
    
    if (esPrimo(n)) {
      System.out.println("Es primo");
    } else {
      System.out.println("No es primo");
    }

		siguientePrimo(n);
		System.out.println("el siguiente primo es: "+siguientePrimo(n));
	
	  System.out.print("Introduce la base: ");
    int x = s.nextInt();    
    System.out.print("Introduce el exponente: ");
    int y = s.nextInt();
		System.out.println("La potencia es: "+potencia(x,y));
		
		
		System.out.println("Introduce el numero para contarlo: ");  
		n =s.nextInt();
		System.out.println("tiene estos numero de numeros: "+digitos(n));
		
		
		System.out.print("Introduce un numero para darle la vuelta : ");
    n =s.nextInt();
		System.out.println("Numero volteado: "+voltear(n));   
		
		System.out.print("Introduce un numero : ");
    n =s.nextInt();
    System.out.print("Introduce el numero que busca : ");
    y =s.nextInt();
		System.out.println("Posicion: "+posicionDeDigito(n,y));
		
		System.out.print("Introduce un numero : ");
    n =s.nextInt();
    System.out.print("Introduce cuantas cifras quiere quitarle por detras : ");
    y =s.nextInt();
		System.out.println("Numero volteado: "+quitaPorDetras(n,y));   
		
		System.out.print("Introduce un numero : ");
    n =s.nextInt();
    System.out.print("Introduce cuantas cifras quiere quitarle por delante : ");
    y =s.nextInt();
		System.out.println("Numero volteado: "+quitaPorDelante(n,y));   
		
		System.out.print("Introduce un numero : ");
    n =s.nextInt();
    System.out.print("Introduce la cifra que quieres añadir por detras : ");
    y =s.nextInt();
		System.out.println("Numero nuevo: "+pegaPorDetras(n,y));   
     
    System.out.print("Introduce un numero : ");
    n =s.nextInt();
    System.out.print("Introduce la cifra que quieres añadir por delante : ");
    y =s.nextInt();
		System.out.println("Numero nuevo: "+pegaPorDelante(n,y));
		
		System.out.print("Introduce un numero : ");
    n =s.nextInt();
    System.out.print("Introduce la posicion inicial : ");
    y =s.nextInt();
		System.out.println("introduce la posicion final: ");
		int z =s.nextInt();
		System.out.println("trozo: "+trozoDeNumero(n,y,z));
		
		
		System.out.print("Introduce primer numero : ");
    n =s.nextInt();
    System.out.print("Introduce segundo numero : ");
    y =s.nextInt();
		System.out.println("Los numeros unidos son: "+juntaNumeros(x,y));
		
		System.out.print("Introduce el numer de huecos del array : ");
    int num =s.nextInt();
    System.out.print("Introduce el maximo: ");
    int maximo =s.nextInt();
    System.out.print("Introduce el minimo : ");
    int minimo =s.nextInt();
    
    
		int []arraySalida= new int [num];
		arraySalida=generaArrayInt(num,maximo,minimo);
		
		for(int i=0;i<num;i++){

			System.out.print(" "+arraySalida[i]);
		}
		
		System.out.println("El menor del array es : "+minimoArrayInt(num,maximo,minimo));
		System.out.println("El mayor del array es : "+maximoArrayInt(num,maximo,minimo));
		System.out.println("la media del array es : "+mediaArrayInt(num,maximo,minimo));
		
		System.out.println("Introduce el numero para comprobar : ");
    int testeo =s.nextInt();
    
    boolean comprobar=estaEnArrayInt(num,maximo,minimo,testeo);
    if(comprobar){
			System.out.println("Existe el numero introducido");
		}else {
			System.out.println("No existe el numero introducido");
		 }
		 
		System.out.println("Introduce el numero que buscas : ");
    testeo =s.nextInt();
    
    System.out.println("El numero esta en la posicion : "+ posicionEnArray(num,maximo,minimo,testeo));
    
    System.out.println("Array volteado: ");
    arraySalida=volteaArrayInt(num,maximo,minimo);
    for(int i=0;i<num;i++){

			System.out.print(" "+arraySalida[i]);
		}
	}
		
	
	
	public static boolean esCapicua(long x) {	
    boolean capicua = false;
 
    if (x < 10) {
      capicua = true;
    } else if((x >= 10)&&(x < 100)) {
      if ((x / 10)==(x % 10)) {
        capicua = true;
      }
    } else if((x >= 100)&&(x < 1000)) {
      if ((x / 100)==(x % 10)) {
        capicua = true;
      }
    } else if((x >= 1000)&&(x < 10000)) {
      if (((x / 1000)==(x % 10))&&((( x / 100 ) % 10)==(( x / 10) % 10))) {
        capicua = true;
      }
    } else if(x >= 10000) {
      if (((x/ 10000) == (x % 10) )&&((((x / 1000) % 10))==((x / 10) % 10))) {
        capicua = true;
      }
    } 
    return capicua;
  }
  
  
  public static boolean esPrimo(long x) {
		boolean vig=false;
    long calcu;
    for (int i=2;i<x;i++) {
			calcu=x%i;
      if (calcu==0) {
        vig=true;
      }
    } 
    return vig;
  }      
	 public static long siguientePrimo(long x) {
		boolean vig=false;
    long calcu;
    while(vig==false){
			for (int i=2;i<x;i++) {
				calcu=x%i;
				if (calcu==0) {
					vig=true;
				}
			}
			x++;
    }
    return x;
	}

		public static int potencia (int base, int exponente) {
    int total=1;
		if (exponente>0){
      for (int i=0;i<exponente;i++) {
        total= base * total;
			}       
    } 
    if (exponente<0) {
      for (int i = 0; i < exponente; i++) {
        total= base* total;				
			}
			total=1/total;
		}
    if(exponente==0){
			total=1;
		}
		return total;
	}
	
	public static int digitos (long x) { 
    int cont = 1;
    while (x > 10) {
      cont++;
      x=x/10;
    }    
		return cont;
  }  
  
   public static long voltear(long x) {
    long alReves=0;
    
    while (x > 0) {
      alReves = (alReves * 10) + (x % 10);
      x /= 10;
    }     
    return alReves;
  }
  
  public static long posicionDeDigito(long x,int y) {
    long alReves=0;
    int test= -1;
    long num=0;
    int cont=0;
    while (x > 0) {
      alReves = (alReves * 10) + (x % 10);
      x /= 10;
    }    
    while((alReves>0)&&(test!=cont)){
			num=alReves % 10;
			alReves /= 10;
			cont++;
			if (num==y){
				test=cont;
			}	
		}
    return test;
  }
  
  public static long quitaPorDetras(long x, int y) {
    
   for(int i=0;i<y;i++) {
      x /= 10;
    }     
    return x;
  }
  
  public static long quitaPorDelante(long x, int y) {
    long alReves=0;
    long derecho=0;

    while (x > 0) {
      alReves = (alReves * 10) + (x % 10);
      x /= 10;
    }
    
    for(int i=0;i<y;i++) {
      alReves /= 10;
    }
    
    while (alReves > 0) {
      derecho = (derecho * 10) + (alReves % 10);
      alReves /= 10;
    }     
    return derecho;
  }
  
  public static long pegaPorDetras(long x, int y) {
		x=x*10;
		x=x+y;     
    return x;
  }
  
  public static long pegaPorDelante(long x, int y) {
    long alReves=0;
    long derecho=0;
    while (x > 0) {
      alReves = (alReves * 10) + (x % 10);
      x /= 10;
    }
		alReves=alReves*10;
		alReves=alReves+y;
    while (alReves > 0) {
      derecho = (derecho * 10) + (alReves % 10);
      alReves /= 10;
    }     
    return derecho;
  }
  
  public static long trozoDeNumero(long x, int y,int z) {
    long alReves=0;
    long derecho=0;
    int cont=0;
   for(int i=0;i<y;i++) {
      x /= 10;
    }     

    while (x > 0) {
      alReves = (alReves * 10) + (x % 10);
      x /= 10;
      cont++;
    }
    for(int i=0;i<cont-z;i++) {
      alReves /= 10;
    }
    
    while (alReves > 0) {
      derecho = (derecho * 10) + (alReves % 10);
      alReves /= 10;
    }     
    return derecho;
  } 
  
  public static long juntaNumeros(long x, long y) {
		long num1=x;
		long num2=y;
		long alReves=0;
		while (y > 0) {
      alReves = (alReves * 10) + (y % 10);
      y /= 10; 
		}   
		while(num2>0){
			num1=num1*10;
			x = (x * 10) + (alReves % 10);
			alReves/=10;	
		}   
    return x;
  }
  
  public static int[] generaArrayInt(int n, int max, int min) {	
	  int [] array= new int [n];
	  for(int i=0;i<n;i++){
			array[i]=(int)(Math.random()*((max-min)-1)+min);
	 } 
	return array;
	}
  
  public static int minimoArrayInt(int n, int max, int min) {	
	  int [] minimoArray= new int [n];
	  minimoArray=generaArrayInt(n,max,min);
	  int menor=max;
	  for(int i=0;i<n;i++){
			if(minimoArray[i]<menor){
				menor=minimoArray[i];
			}
		} 
	return menor;
	}
	
	public static int maximoArrayInt(int n, int max, int min) {	
	  int [] maximoArray= new int [n];
	  maximoArray=generaArrayInt(n,max,min);
	  int maximo=min;
	  for(int i=0;i<n;i++){
			if(maximoArray[i]>maximo){
				maximo=maximoArray[i];
			}
		} 
	return maximo;
	}
	
	public static int mediaArrayInt(int n, int max, int min) {	
	  int [] mediaArray= new int [n];
	  mediaArray=generaArrayInt(n,max,min);
	  int media=0;
	  for(int i=0;i<n;i++){
			media=media+mediaArray[i];
		} 
	return media;
	}
	
	public static boolean estaEnArrayInt(int n, int max, int min,int testeo) {	
	  int [] Array= new int [n];
	  Array=generaArrayInt(n,max,min);
	  
	  for(int i=0;i<n;i++){
			if(Array[i]==testeo){
				return true;
			}
		} 
	return false;
	}
	
	public static int posicionEnArray(int n, int max, int min,int testeo) {	
	  int [] Array= new int [n];
	  Array=generaArrayInt(n,max,min);
	  int cont=0;
	  int verificar=0;
	  int i=0;
	  while(Array[i]!=testeo){
			cont++;
			i++;
		}
		return cont; 
	}
	
	public static int[] volteaArrayInt(int n, int max, int min) {	
	  int [] Array= new int [n];
	  int [] ArrayVolteado= new int [n];
	  Array=generaArrayInt(n,max,min);
	  for(int i=0;i<n;i++){
			Array[i]=ArrayVolteado[n-i];			
		}
		return ArrayVolteado; 
	}
	
	
}

