package POOExtras.Ejercicio7;

class Circulo implements iFigura2D {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double perimetro() {
        return 2 * 3.14 * radio;
    }
    
    public double area() {
        return 3.14 * radio * radio;
    }
    
    public void escalar(double escala) {
        radio *= escala;
    }
    
    public void imprimir() {
        System.out.printf("Círculo de radio %.2f - perímetro: %.2f, área: %.2f\n", radio, perimetro(), area());
    }
}