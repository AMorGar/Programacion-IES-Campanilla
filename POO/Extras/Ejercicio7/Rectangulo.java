package POOExtras.Ejercicio7;

class Rectangulo implements iFigura2D {
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double perimetro() {
        return 2 * (ancho + alto);
    }
    
    public double area() {
        return ancho * alto;
    }
    
    public void escalar(double escala) {
        ancho *= escala;
        alto *= escala;
    }
    
    public void imprimir() {
        System.out.printf("Rectángulo de ancho %.2f y alto %.2f - perímetro: %.2f, área: %.2f\n", ancho, alto, perimetro(), area());
    }
}