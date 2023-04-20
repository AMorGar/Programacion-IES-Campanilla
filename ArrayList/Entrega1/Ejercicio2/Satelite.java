package ArrayList.Ejercicio2;

public class Satelite extends Astro {
    private String nombre;
    private double masa;
    private double diametro;
    private double rotacion;
    private double translacion;
    private double distancia;
    
    public Satelite(String nombre, double masa, double diametro, double rotacion,double translacion, double distancia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.rotacion = rotacion;
        this.translacion = translacion;
        this.distancia = distancia;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
        
    public void setMasa(double masa) {
        this.masa = masa;
    }
    public double getMasa() {
        return masa;
    }
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    public double getDiametro() {
        return diametro;
    }
    
    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }
    public double getRotacion() {
        return rotacion;
    }
    
    public void setTranslacion(double translacion) {
        this.translacion = translacion;
    }
    public double getTranslacion() {
        return translacion;
    }
    
        
    public void setDistancia(double distancia) {
        this.distancia= distancia;
    }
    public double getDistancia() {
        return distancia;
    }
 //Imprime la información guardada en cada variable   
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa);
        System.out.println("Diámetro medio: " + diametro);
        System.out.println("Período de rotación: " + rotacion);
        System.out.println("Período de traslación: " + translacion);
        System.out.println("Distancia media: " + distancia);
    }
}