import java.util.ArrayList;
public class SistemaSolar {
    public static void main(String[] args) {
       ArrayList<Planeta> planetas = new ArrayList<>();
       int menu;
        System.out.println("---Menu---");
        System.out.println("1. Inicializar");
        System.out.println("2. Registrar planetas y satélites");
        System.out.println("3. Mostrar info del astro");
        System.out.println("4. Mostrar satélites de un planeta");
        System.out.println("5. Eliminar un planeta");
        System.out.println("6. Vaciar ArrayList");
        System.out.println("7. Salir");

        menu = Leer.leerEntero("Que quieres hacer?");

        if (menu == 1){
            Planeta tierra = new Planeta("Tierra", 6371, 600000000, 5.51, 24, 17.18, 9.8, 150000000, 781 );
            Planeta marte = new Planeta("Marte", 5000, 40000000, 4.78, 17, 200, 6, 10000000, 2);
            Satelite Luna = new Satelite("Luna", 1000, 20000, 5.51, 24, 0, 2, 85,67, tierra);
            tierra.add(Luna);
            planetas.add(tierra);
            planetas.add(marte);
        }
        if (menu == 2){
            String nom;
            double radio, masa, densidad, rotacion, temperatura, gravedad, distancia_sol, orbita;
            Planeta p1;
            nom = Leer.leerTexto("Di el nombre del astro");
            masa = Leer.leerDouble("Cual es la masa del astro?");
            radio = Leer.leerDouble("Cual es el radio del astro?");
            rotacion = Leer.leerDouble("Cual es la rotacion del astro?");
            densidad = Leer.leerDouble("Cual es la densidad del astro?");
            temperatura = Leer.leerDouble("Cual es la temperatura del astro?");
            gravedad = Leer.leerDouble("Cual es la gravedad del astro?");
            distancia_sol = Leer.leerDouble("Cual es la distancia al sol del astro?");
            orbita = Leer.leerDouble("Cual es la orbita del astro?");
            p1 = new Planeta(nom, radio, masa, densidad, rotacion, temperatura, gravedad, distancia_sol, orbita);
            planetas.add(p1);

        }
    }
}