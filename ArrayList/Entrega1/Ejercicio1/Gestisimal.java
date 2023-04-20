package ArrayList.Ejercicio1;

import java.util.Scanner;
import java.util.ArrayList;
public class Gestisimal {

// N determina el tamaño del array
  static final int N = 100;
//se declara el array con el tamaño de la variable antes creada
  static ArrayList<Articulo> articulos = new ArrayList<Articulo>();
  
  public static void main(String[] args) {
// Inicializa el array
    for(int contador = 0; contador < N; contador++) {
      articulos.add(new Articulo());
    }
//Se declaran todas las variables
    int opcion;
    int cantidad;
    double precioDeCompraIntroducido;
    double precioDeVentaIntroducido;
    String codigoIntroducido = "";
    String descripcionIntroducida;
    Scanner s = new Scanner(System.in);

//Inico del bucle que le mantiene en el menu hasta dar al 7
    do {
        System.out.print("G E S T I S I M A L");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());
//Diferentes opcciones para las elecciones del menu     
      switch (opcion) {
        case 1:
        System.out.print("LISTADO");
          
          for(Articulo a : articulos) {
            if (!a.getCodigo().equals("LIBRE")) {
              System.out.println(a);
            }
          }
          break;
        case 2:
        System.out.print("NUEVO ARTÍCULO");
          
          if (Buscarhueco() == N) {
            System.out.println("Lo siento, la base de datos está llena.");
          } else {
//Introduce datos de cada articulo
            System.out.println("Por favor, introduzca los datos del artículo.");  
            System.out.print("Código: ");
// Comprueba que el código introducido no se repita
            do {
              codigoIntroducido = s.nextLine();
              if (existe(codigoIntroducido)) {
                System.out.println("Ese código ya existe en la base de datos.");
                System.out.print("Introduzca otro código: ");
              }
            } while (existe(codigoIntroducido));
            System.out.print("Descripcion: ");
            descripcionIntroducida = s.nextLine();
            System.out.print("Precio de compra: ");
            precioDeCompraIntroducido = Double.parseDouble(s.nextLine());
            System.out.print("Precio de venta: ");
            precioDeVentaIntroducido = Double.parseDouble(s.nextLine());
            System.out.print("Stock: ");
            cantidad = Integer.parseInt(s.nextLine());
// Crea el nuevo artículo
            articulos.add(new Articulo(
              codigoIntroducido, descripcionIntroducida, precioDeCompraIntroducido,
              precioDeVentaIntroducido, cantidad));
          }         
          break;
        case 3:
        System.out.print("BAJA");
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.nextLine();
    
          if (!existe(codigoIntroducido)) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            articulos.remove(articulos.get(localizar(codigoIntroducido)));
            System.out.println("Artículo borrado.");  
          }
          
          break;
        case 4:
        System.out.print("MODIFICACIÓN");
          
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.nextLine();

          if (!existe(codigoIntroducido)) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            System.out.print("Introduzca los nuevos datos del artículo");
            System.out.println(" o INTRO para dejarlos igual.");
      
            int i = localizar(codigoIntroducido);

            System.out.println("Código: " + articulos.get(i).getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntroducido = s.nextLine();
            if (!codigoIntroducido.equals("")) {
              articulos.get(i).setCodigo(codigoIntroducido);
            }
            
            System.out.println("Descripción: " + articulos.get(i).getDescripcion());
            System.out.print("Nueva descripción: ");
            descripcionIntroducida = s.nextLine();
            if (!descripcionIntroducida.equals("")) {
              articulos.get(i).setDescripcion(descripcionIntroducida);
            }
            
            System.out.println("Precio de compra: " + articulos.get(i).getPrecioTotal());
            System.out.print("Nuevo precio de compra: ");
            String precioDeCompraIntroducidoString = s.nextLine();
            if (!precioDeCompraIntroducidoString.equals("")) {
              articulos.get(i).setPrecioTotal(Double.parseDouble(precioDeCompraIntroducidoString));
            }
            System.out.println("Precio de venta: " + articulos.get(i).getPrecioDeVenta());
            System.out.print("Nuevo precio de venta: ");
            String precioDeVentaIntroducidoString = s.nextLine();
            if (!precioDeVentaIntroducidoString.equals("")) {
              articulos.get(i).setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
            }
            System.out.println("Stock: " + articulos.get(i).getalmacen());
            System.out.print("Nuevo stock: ");
            String stockIntroducidoString = s.nextLine();
            if (!stockIntroducidoString.equals("")) {
              articulos.get(i).setalmacen(Integer.parseInt(stockIntroducidoString));
            }
          }
          
          break;
          case 5:
          System.out.print("ENTRADA DE MERCANCÍA");
            
            System.out.print("Por favor, introduzca el código del artículo: ");
            codigoIntroducido = s.nextLine();
        
            if (!existe(codigoIntroducido)) {
              System.out.println("Lo siento, el código introducido no existe.");
            } else {
              int i = localizar(codigoIntroducido);
              System.out.println("Entrada de mercancía del siguiente artículo: ");
              System.out.println(articulos.get(i));
              System.out.print("Introduzca el número de unidades que entran: ");
              String cantidadString = s.nextLine();
              articulos.get(i).setalmacen(
                Integer.parseInt(cantidadString) + articulos.get(i).getalmacen());
              System.out.println("La mercancía ha entrado en el almacén.");  
            }
            
            break;
            case 6:
            System.out.print("SALIDA DE MERCANCÍA");
              
              System.out.print("Por favor, introduzca el código del artículo: ");
              codigoIntroducido = s.nextLine();

              if (!existe(codigoIntroducido)) {
                System.out.println("Lo siento, el código introducido no existe.");
              } else {
                int i = localizar(codigoIntroducido);
                System.out.println("Salida de mercancía del siguiente artículo: ");
                System.out.println(articulos.get(i));
                System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
                cantidad = Integer.parseInt(s.nextLine());
                if (articulos.get(i).getalmacen() - cantidad > 0) {
                  articulos.get(i).setalmacen(articulos.get(i).getalmacen() - cantidad);
                  System.out.println("La mercancía ha salido del almacén.");
                } else {
                  System.out.println("Lo siento, no se pueden sacar tantas unidades.");
                }
              }
              
              break;
      }
    } while (opcion != 7);
  }
//Busca un hueco libre
  public static int Buscarhueco() {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).getCodigo().equals("LIBRE")) {
        return i;
      }
    }
    return -1;
  }
//Comprueba si existe el codigo o no
  public static boolean existe(String codigo) {
    for (Articulo a : articulos) {
      if (a.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }


//Devuelve la posición en la que se encuentra x articulo
  public static int localizar(String codigo) {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
  
}