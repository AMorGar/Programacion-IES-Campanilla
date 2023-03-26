package POOExtras.Ejercicio7;
import java.util.ArrayList;

public class ProgramaFiguras {
    public static void main(String[] args) {
        ArrayList<iFigura2D> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(5));
        figuras.add(new Rectangulo(8, 4));
        figuras.add(new Triangulo(6, 3));
        figuras.add(new Circulo(10));
        System.out.println("Figuras antes de aplicar la escala:");
        for (iFigura2D f : figuras) {
            f.imprimir();
        }
        for (iFigura2D f : figuras) {
            f.escalar(2);
        }
        System.out.println("\nFiguras en escala 2:");
        for (iFigura2D f : figuras) {
            f.imprimir();
        }
        for (iFigura2D f : figuras) {
            f.escalar(0.1);
        }
        System.out.println("\nFiguras en escala 0.1:");
        for (iFigura2D f : figuras) {
            f.imprimir();
        }
    }
}
