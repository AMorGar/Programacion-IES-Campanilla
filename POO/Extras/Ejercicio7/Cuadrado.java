package POOExtras.Ejercicio7;

class Cuadrado implements iFigura2D {
    private double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    public double perimetro() {
        return 4 * lado;
    }
    
    public double area() {
        return lado * lado;
    }
    
    public void escalar(double escala) {
        lado *= escala;
    }
    
    public void imprimir() {
        System.out.printf("Cuadrado de lado %.2f - perímetro: %.2f, área: %.2f\n", lado, perimetro(), area());
    }
}