public class Satelite extends Astro{
    private double distancia_planeta;
    private int orbita;
    private Planeta planeta;

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
}
