package ArrayList.Ejercicio2;
public abstract class Astro {
    private double masa;
    private double diametro;
    private double rotacion;
    private double traslacion;
    private double distancia;
//Constructor de la clase astro    
    public Astro(double masa, double diametro, double rotacion, double traslacion, double distancia) {
        this.masa = masa;
        this.rotacion = rotacion;
        this.traslacion = traslacion;
        this.distancia = distancia;
    }
    //Este constructor está para que no se queje la clase satelite
    public Astro(){

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
    

    public void setTraslacion(double traslacion) {
        this.traslacion = traslacion;
    }
    public double getTraslacion() {
        return traslacion;
    }
    

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public double getDistancia() {
        return distancia;
    }
    

    
    public abstract void mostrarInformacion();
}