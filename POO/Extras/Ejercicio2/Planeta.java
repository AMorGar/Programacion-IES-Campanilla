package POOExtras.Ejercicio2;
import java.util.ArrayList;


public class Planeta extends Astro {
    private ArrayList<Satelite> satelites;
 //Usamos arrayList para almacenarlos en modo de lista y que sea mas facil a la hora de obtenerlos en el main   
    public Planeta(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        super(masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia);
        satelites = new ArrayList<>();
    }
    
    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }
    
    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }
    
    public void addSatelite(Satelite satelite) {
        satelites.add(satelite);
    }
    
    public void removeSatelite(Satelite satelite) {
        satelites.remove(satelite);
    }
//Funcion que mestra los datos obtenidos en los diferentes metodos

    public void mostrarInformacion() {
        System.out.println("Planeta:");
        System.out.println("Masa: " + getMasa());
        System.out.println("Diámetro medio: " + getDiametroMedio());
        System.out.println("Período de rotación: " + getPeriodoRotacion());
        System.out.println("Período de traslación: " + getPeriodoTraslacion());
        System.out.println("Distancia media: " + getDistanciaMedia());
        
        if (satelites.size() > 0) {
            System.out.println("Satélites:");
            for (Satelite satelite : satelites) {
                satelite.mostrarInformacion();
            }
        }
    }
}