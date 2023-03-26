package POOExtras.Ejercicio7;

class Triangulo implements iFigura2D {
    private double ancho;
    private double alto;
    
    public Triangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double perimetro() {
        double hipotenusa = Math.sqrt(ancho * ancho + alto * alto);
        return ancho + alto + hipotenusa;
    }
    
    public double area() {
        return ancho * alto / 2;
    }
    
    public void escalar(double escala) {
        ancho *= escala;
        alto *= escala;
    }
    
    public void imprimir() {
        System.out.printf("Triángulo de ancho %.2f y alto %.2f - perímetro: %.2f, área: %.2f\n", ancho, alto, perimetro(), area());
    }
}