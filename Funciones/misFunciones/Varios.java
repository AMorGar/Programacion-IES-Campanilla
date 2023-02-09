
/*
*libreria Funciones de los progrmas
*/
package misFunciones; 
import java.util.Scanner;
public class Varios{
	
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
	
	public static void piramide(int num, String relleno) {	
	     for (int i = 0; i < num; ++i) { 
      System.out.println(); 
			for (int j = 0; j < num-i-1; ++j) { 
				System.out.print(" ");
      } 

      for (int j = 0; j < 2*i+1; ++j){ 
				System.out.print(relleno); 
       } 

     } 
		System.out.println();  
	}
/*	
	public static double volteaArrayInt(int x) {	
		System.out.println("introduzca el radio: ");
		int x =s.nextInt();
		return x; 
	}
	
  public static int menu() {
		Scanner s = new Scanner(System.in);	
		System.out.println("elige que calculos quieres hacer: ");
		System.out.println("1. Perimetro circunferencia ");
		System.out.println("2. Area ");
		int x =s.nextInt();
		switch (x){
			case 1:
				
				break;
			case 2:
				
				break;	
		default:				
		}
		
		return; 
	}
 */
}

