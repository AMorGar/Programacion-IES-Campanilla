/*
*libreria Funciones de los progrmas
*/
package misFunciones; 
	public class Matematicas{
	

		public static double multiplica(int n, int y) {	
			double total=n*y;
			return total; 
		}
		
		public static int minimo(int n, int y) {	
			int menor =y;
			if(n<y){
			 menor=n;
			}
			return menor; 
		}
		
		public static int dimesigno(int n) {	
			int test=0;
			if(n<0){
				test=-1;
			} else if(n==0){
				test=0;
		  } else if(n>0){
				test=1;
			}  
			return test; 
		}
		
		
		public static double perimetroRectangulo(double n, double y) {	
			double total=n+n+y+y;
			return total; 
		}
		
		
		public static double areaRectangulo(double n, double y) {	
			double total=(n*y)/2;
			return total; 
		}
		
		public static int suma1aN(int n) {
			int total=0;	
			for(int i=1;i<=n;i++){
				total=total+i;				
			}
		return total;
		}
		
		public static int producto1aN(int n) {	
			int total=1;	
			for(int i=1;i<=n;i++){
				total=total*i;				
			}
		return total;
		}
		
		public static double intermedio1aN(int n) {	
			double total=0;
			for(int i=1;i<=n;i++){
					total++;				
				}
			total=total/2;
		return total; 
		}
		
		public static int maximo(int n, int y) {	
			int maximo = n;
			if(n<y){
			 maximo=y;
			}
			return maximo; 
		}
		public static void tablaMultiplicar(int n) {	
			int ope;
			for(int i=1;i<=10;i++){
				ope=i*n;
				System.out.println(n+"x"+i+" = "+ope);	
			}
		}
		public static void arrayDe1a100(int n) {
			int [] Array= new int [n];	
			for(int i=0;i<n;i++){
				Array[i]=i+1;
				System.out.print(Array[i]+" ");	
			}
		}
		public static int media(int n) {	
			int media=0;
			int [] Array= new int [n];
			for(int i=0;i<n;i++){
				Array[i]=i+1;
			}
			for(int i=0;i<n;i++){
				media=media + Array[i];
			} 
		return media;
		}
		public static String primo(int n) {	
			int vig=0;
			int calcu;
			String juez;
			for (int i=2;i<n;i++) {
				calcu=n%i;
				if (calcu==0) {
					vig=1;
				}
			}        
			if (vig==0) {
				juez="Es primo";
			} else {
				juez="No es primo";
			}
			return juez;
		}
		public static String DNI(long n) {	
			long total = n/23;
			String letra="se ha equivocado";
			if(total==0){
				letra="T";
			} else if(total==1){
				letra="R";
			} else if(total==2){
				letra="W";
			} else if(total==3){
				letra="A";
			} else if(total==4){
				letra="G";
			} else if(total==5){
				letra="M";
			} else if(total==6){
				letra="Y";
			} else if(total==7){
				letra="F";
			} else if(total==8){
				letra="P";
			} else if(total==9){
				letra="D";
			} else if(total==10){
				letra="X";
			} else if(total==11){
				letra="B";
			} else if(total==12){
				letra="N";
			} else if(total==13){
				letra="J";
			} else if(total==14){
				letra="Z";
			} else if(total==15){
				letra="S";
			} else if(total==16){
				letra="Q";
			} else if(total==17){
				letra="V";
			} else if(total==18){
				letra="H";
			} else if(total==19){
				letra="L";
			} else if(total==20){
				letra="C";
			} else if(total==21){
				letra="K";
			} else if(total==22){
				letra="E";
			}
		return letra;
			
		}
	}

