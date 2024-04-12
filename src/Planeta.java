import java.util.ArrayList;

public class Planeta extends Astro {
    private double distancia_sol;
    private double orbita;
    private ArrayList<Satelite> satelits;

    Planeta(String nombre, double radio, double masa, double densidad, double rotacion, double temperatura,
                   double gravedad, double distancia_sol, double orbita, ArrayList<Satelite> satelits){
        super (nombre, radio, masa, densidad, rotacion, temperatura, gravedad);
        this.distancia_sol = distancia_sol;
        this.orbita = orbita;
        this.satelits = satelits;
    }
    Planeta(String nombre, double radio, double masa, double densidad, double rotacion, double temperatura,
            double gravedad, double distancia_sol, double orbita){
        super (nombre, radio, masa, densidad, rotacion, temperatura, gravedad);
        this.distancia_sol = distancia_sol;
        this.orbita = orbita;
        this.satelits = new ArrayList<>();
    }
    Planeta(){
        super();
        satelits=new ArrayList();
    }

    public double getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(double distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public double getOrbita() {
        return orbita;
    }

    public void setOrbita(double orbita) {
        this.orbita = orbita;
    }

    public ArrayList<Satelite> getSatelits() {
        return satelits;
    }

    public void setSatelits(ArrayList<Satelite> satelits) {
        this.satelits = satelits;
    }
    public void add(Satelite s){
        satelits.add(s);
    }
    public void mostrarinfo(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Radio: "+ getRadio());
        System.out.println("Masa: "+ getMasa());
        System.out.println("Densidad: "+ getDensidad());
        System.out.println("Rotacion: "+ getRotacion());
        System.out.println("Temperatura: "+ getTemperatura());
        System.out.println("Gravedad: "+ getGravedad());
        System.out.println("Distancia al Sol: "+ distancia_sol);
        System.out.println("Orbita: "+ orbita);
    }
    double pesPlaneta;
    public double calcularPes(double masaObjeto){
        pesPlaneta = masaObjeto *(G*getMasa()/Math.pow(getRadio(), 2));
        return pesPlaneta;
    }
    public String toString() {
        return "Planeta "+getNombre()+" con masa "+getMasa()+" tiene un radio de "+ getRadio()+" y una distancia al sol de "+getDistancia_sol();
    }
}
