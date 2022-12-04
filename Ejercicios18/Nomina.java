/*
Alejandro Moreno Garrido
* 
* Nomina
 */
public class Nomina {
  public static void main(String[] args) {
//menu
    System.out.println("1 - Programador junior");
    System.out.println("2 - Programador senior");
    System.out.println("3 - Jefe de proyec.");
    System.out.print("Introduce el cargo del empleado: ");
    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.print(" Días  visitando clientes? ");
    int diasVisita = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce su estado civil (1 para soltero y 2 para casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());

    double sueldoBase = 0;
//cambio de variable dependiendo del tipo elegido
    switch(cargo) {
      case 1: 
        sueldoBase = 950;
        break;
      case 2: 
        sueldoBase = 1200;
        break;
      case 3: 
        sueldoBase = 1600;
        break;
      default:
        System.out.println("Eleccion incorrecta.");
    }
//Calculos
    double sueldoDietas = diasVisita * 30;
    double sueldoBruto = sueldoBase + sueldoDietas;
    double irpf = 0;
//Depende del cambio de variable antes realizado cambiara el irpf
    if (estadoCivil == 1) { 
      irpf = 25;
    } else if (estadoCivil == 2) { 
      irpf = 20;
    } else {
      System.out.println("Eleccion erronea, reinicie el programa");
    }
    
    double cuantiaIrpf = (sueldoBruto * irpf) / 100;
//Resultados Formateados
    System.out.printf(" Sueldo base            %7.2f \n", sueldoBase);
    System.out.printf(" Dietas (%2d viajes)     %7.2f \n", diasVisita, sueldoDietas);
    System.out.println("                                                           ");
    System.out.printf(" Sueldo bruto           %7.2f \n", sueldoBruto);
    System.out.printf(" Retención IRPF (%.0f%%)  %7.2f \n", irpf, cuantiaIrpf);
    System.out.println("                                                                ");
    System.out.printf(" Sueldo neto            %7.2f \n", sueldoBruto - cuantiaIrpf);
    System.out.println("                                                                 ");
  }
}
