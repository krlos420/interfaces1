public class Satelite extends Astro{
    private double distancia_planeta;
    private int orbita;
    private Planeta planeta;

// CONSTRUCTORS
    public Satelite(String nombre, double radio, double masa, double densidad, double rotacion, double temperatura,
                    double gravedad, double distancia_planeta, int orbita, Planeta planeta) {
        super(nombre, radio, masa, densidad, rotacion, temperatura, gravedad);
        this.distancia_planeta = distancia_planeta;
        this.orbita = orbita;
        this.planeta = planeta;
    }
// GETTERS I SETTERS
    public double getDistancia_planeta() {
        return distancia_planeta;
    }

    public void setDistancia_planeta(double distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public int getOrbita() {
        return orbita;
    }

    public void setOrbita(int orbita) {
        this.orbita = orbita;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public void mostrarinfo(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Radio: "+ getRadio());
        System.out.println("Masa: "+ getMasa());
        System.out.println("Densidad: "+ getDensidad());
        System.out.println("Rotacion: "+ getRotacion());
        System.out.println("Temperatura: "+ getTemperatura());
        System.out.println("Gravedad: "+ getGravedad());
        System.out.println("Distancia al planeta: "+ distancia_planeta);
        System.out.println("Orbita: "+ orbita);
    }
    double pesSatelit;
    public double calcularPes(double masaObjeto){
        pesSatelit = getMasa()*getGravedad();
        return pesSatelit;
    }
    public String toString() {
        return "Satelit "+getNombre()+" con masa "+getMasa()+" tiene un radio de "+ getRadio()+" y una distancia al sol de "+getPlaneta().getDistancia_sol();
    }
}
