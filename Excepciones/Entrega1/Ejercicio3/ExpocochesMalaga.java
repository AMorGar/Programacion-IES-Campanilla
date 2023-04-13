package Ejercicio7;

public class ExpocochesMalaga {
    public static void main(String[] args) {
      
      Zona principal = new Zona(1000);
      Zona compraVenta = new Zona(200);
      Zona vip = new Zona(25);
      
      int opcion = 0;
      int opcion2 = 0;
      int n = 0;
      
      do {
        System.out.println("\nEXPOCOCHES MÁLAGA");
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
        try{
        opcion = Integer.parseInt(System.console().readLine());
        }

        catch(Exception e){
          System.out.println("Te hs equivocado jaja");
          System.out.println("Excepciom: " + e.getClass());
          System.out.println("Error: " + e.getMessage());
        }
        if (opcion == 1) {
          System.out.println("\nZona principal: " + principal.getEntradasRestantes());
          System.out.println("Zona de compraventa: " + compraVenta.getEntradasRestantes());
          System.out.println("Zona vip: " + vip.getEntradasRestantes());
        }
        
        if (opcion == 2) {
          System.out.println("\n1. Principal");
          System.out.println("2. Compra-venta");
          System.out.println("3. Vip");
          System.out.print("Que zona te interesa?");
          try{
            opcion2 = Integer.parseInt(System.console().readLine());
            }
    
            catch(Exception e){
              System.out.println("Te hs equivocado jaja");
              System.out.println("Excepciom: " + e.getClass());
              System.out.println("Error: " + e.getMessage());
            }          
          
          
          System.out.print("Cuantos sois? ");
          n = Integer.parseInt(System.console().readLine());
          
          switch (opcion2) {
            case 1:
              principal.vender(n);
              break;
            case 2:
              compraVenta.vender(n);
              break;
            case 3:
              vip.vender(n);
              break;
            default:
          }
        }
      } while (opcion < 3);
    }
  }