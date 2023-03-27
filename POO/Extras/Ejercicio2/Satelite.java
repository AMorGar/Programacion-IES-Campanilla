package POOExtras.Ejercicio2;

public class Satelite extends Astro {
    private String nombre;
    private double masa;
    private double diametro;
    private double periodoRotacion;
    private double periodoTranslacion;
    private double distanciaMedia;
    
    public Satelite(String nombre, double masa, double diametro, double periodoRotacion,double periodoTranslacion, double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.periodoTranslacion = periodoTranslacion;
        this.distanciaMedia = distanciaMedia;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getMasa() {
        return masa;
    }
    
    public void setMasa(double masa) {
        this.masa = masa;
    }
    
    public double getDiametro() {
        return diametro;
    }
    
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    public double getPeriodoRotacion() {
        return periodoRotacion;
    }
    
    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }
    
    public double getPeriodoTranslacion() {
        return periodoTranslacion;
    }
    
    public void setPeriodoTranslacion(double periodoTranslacion) {
        this.periodoTranslacion = periodoTranslacion;
    }
    
    public double getDistanciaMedia() {
        return distanciaMedia;
    }
    
    public void setDistanciaMedia(double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }
 //Imprime la información guardada en cada variable   
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa);
        System.out.println("Diámetro medio: " + diametro);
        System.out.println("Período de rotación: " + periodoRotacion);
        System.out.println("Período de traslación: " + periodoTranslacion);
        System.out.println("Distancia media: " + distanciaMedia);
    }
}