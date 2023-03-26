package POOExtras.Ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;

public class ProgramaProductos {
    public static void main(String[] args) {
        Producto p1 = new Producto("Leche", 2);
        Producto p2 = new Producto("Pan", 3);
        Producto p3 = new Producto("Huevos", 6);
        Producto p4 = new Producto("Queso", 1);
        Producto p5 = new Producto("Manzanas", 5);
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);
        System.out.println("Contenido de la lista:");
        Iterator<Producto> iterador = listaProductos.iterator();
        while (iterador.hasNext()) {
            Producto p = iterador.next();
            System.out.println(p.getNombre() + " - " + p.getCantidad());
        }
        listaProductos.remove(0);
        listaProductos.remove(2);
        Producto nuevoProducto = new Producto("Natilla", 4);
        listaProductos.add(2, nuevoProducto);
        System.out.println("\nContenido de la lista:");
        iterador = listaProductos.iterator();
        while (iterador.hasNext()) {
            Producto p = iterador.next();
            System.out.println(p.getNombre() + " - " + p.getCantidad());
        }
        listaProductos.clear();
        System.out.println("\nContenido de la lista tras eliminar:");
        System.out.println(listaProductos);
    }
}