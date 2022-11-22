import java.util.Scanner;

/*
Alejandro Moreno Garrido
* Horoscopo segun el dia y el mes
 */





public class Horoscopo {

  public static void main(String[] args) {
   
	Scanner s = new Scanner(System.in);


	System.out.print("Introduce tu dia: ");
	int dia =  s.nextInt();
	System.out.print("Introduce tu mes: ");
	int mes =  s.nextInt();


	if (mes == 1) {
		if (dia >= 21) {
		 
			System.out.print("acuario");
		} else {
 
			System.out.print("capricornio");
		}
	}
	if (mes == 2) {
		if (dia >= 19) {
			System.out.print("piscis");
		} else {
			System.out.print("acuario");
		}
	}
	if (mes == 3) {
		if (dia >= 20) {
			
			System.out.print("aries");
		} else {
			
			System.out.print("piscis");
		}
	}
	if (mes == 4) {
		if (dia >= 20) {
			System.out.print("tauro");
		} else {
		   System.out.print("Aries");
		}
	}
	if (mes == 5) {
		if (dia >= 21) {
		   
			System.out.print("geminis");
		} else {
			
		   System.out.print("tauro");
		}
	}
	if (mes == 6) {
		if (dia >= 20) {
			System.out.print("cancer");
		} else {
			System.out.print("geminis");
		}
	}
	if (mes == 7) {
		if (dia >= 22) {
			
			System.out.print("leo");
		} else {
		  
			System.out.print("cancer");
		}
	}
	if (mes == 8) {
		if (dia >= 21) {
			System.out.print("virgo");
		} else {
			System.out.print("leo");
		}
	}
	if (mes == 9) {
		if (dia >= 22) {
		   
			System.out.print("libra");
		} else {
		   
			System.out.print("virgo");
		}
	}
	if (mes == 10) {
		if (dia >= 22) {
			System.out.print("escorpion");
		} else {
			System.out.print("libra");
		}
	}
	if (mes == 11) {
		if (dia >= 21) {
			
			System.out.print("sagitario");
		} else {
			
			System.out.print("escorpion");
		}
	}
	if (mes == 12) {
		if (dia >= 21) {
		   System.out.print("capricornio");
		} else {
			System.out.print("sagitario");
		}
	}
	
	
}
}
/**
switch(mes) {
      case 1:
        if (dia < 21) {
          System.out.print("capricornio");
        } else {
         System.out.print("acuario");
        }
        break;
      case 2:
        if (dia < 20) {
          System.out.print("acuario");
        } else {
          System.out.print("piscis");
        }
        break;
      case 3:
        if (dia < 21) {
          System.out.print( "piscis");
        } else {
        System.out.print("aries");
        }
        break;
      case 4:
        if (dia < 21) {
         System.out.print( "aries");
        } else {
         System.out.print("tauro");
        }
        break;
      case 5:
        if (dia < 20) {
          System.out.print("tauro");
        } else {
         System.out.print("géminis");
        }
        break;
      case 6:
        if (dia < 22) {
          System.out.print("géminis");
        } else {
          System.out.print("cáncer");
        }
        break;
      case 7:
        if (dia < 22) {
          System.out.print("cáncer");
        } else {
         System.out.print("Leo");
        }
        break;
      case 8:
        if (dia < 24) {
          System.out.print(leo");
        } else {
          System.out.print("virgo");
        }
        break;
      case 9:
        if (dia < 23) {
          System.out.print( "virgo");
        } else {
          System.out.print( "libra");
        }
        break;
      case 10:
        if (dia < 23) {
          System.out.print( "libra");
        } else {
          System.out.print( "escorpio");
        }
        break;
      case 11:
        if (dia < 23) {
          System.out.print("escorpio");
        } else {
          System.out.print("sagitario");
        }
        break;
      case 12:
        if (dia < 21) {
          System.out.print("sagitario");
        } else {
          System.out.print("capricornio");
        }
        break;
      default:
    }
**/

