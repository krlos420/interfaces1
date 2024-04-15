import java.util.ArrayList;
public class SistemaSolar {
    public static void main(String[] args) {
       ArrayList<Planeta> planetas = new ArrayList<>();
       int menu;
       boolean av = true;
       while (av = true){
            System.out.println("---Menu---");
            System.out.println("1. Inicializar");
            System.out.println("2. Registrar planetas y satélites");
            System.out.println("3. Mostrar info del planeta");
            System.out.println("4. Mostrar satélites de un planeta");
            System.out.println("5. Eliminar un planeta");
            System.out.println("6. Vaciar ArrayList");
            System.out.println("7. Salir");

            menu = Leer.leerEntero("Que quieres hacer? ");

            if (menu == 1){
                Planeta tierra = new Planeta("Tierra", 6371, 600000000, 5.51, 24, 17.18, 9.8, 150000000, 781 );
                Planeta marte = new Planeta("Marte", 5000, 40000000, 4.78, 17, 200, 6, 10000000, 2);
                Satelite luna = new Satelite("Luna", 1000, 20000, 5.51, 24, 0, 2, 85,67, tierra);
                tierra.add(luna);
                planetas.add(tierra);
                planetas.add(marte);
            }
            if (menu == 2) {
                String nom;
                String seguir = "s";
                double radio, masa, densidad, rotacion, temperatura, gravedad, distancia_sol, orbita;
                Planeta p1;
                while (seguir.equalsIgnoreCase("s")) {
                    nom = Leer.leerTexto("Cual es el nombre del astro? ");
                    masa = Leer.leerDouble("Cual es la masa del astro? ");
                    radio = Leer.leerDouble("Cual es el radio del astro? ");
                    rotacion = Leer.leerDouble("Cual es la rotacion del astro? ");
                    densidad = Leer.leerDouble("Cual es la densidad del astro? ");
                    temperatura = Leer.leerDouble("Cual es la temperatura del astro? ");
                    gravedad = Leer.leerDouble("Cual es la gravedad del astro? ");
                    distancia_sol = Leer.leerDouble("Cual es la distancia al sol del astro? ");
                    orbita = Leer.leerDouble("Cual es la orbita del astro? ");
                    p1 = new Planeta(nom, radio, masa, densidad, rotacion, temperatura, gravedad, distancia_sol, orbita);
                    planetas.add(p1);
                    seguir = Leer.leerTexto("Quieres añadir otro planeta (s/n)? ");
                }
            }
            if (menu == 3){
                for (int i = 0; i< planetas.size();i++){
                    System.out.println(i+"-"+planetas.get(i).getNombre());
                }
                int info = Leer.leerEntero("De que planeta quieres ver la info? ");
                planetas.get(info).mostrarinfo();
            }
            if (menu == 4){

                for (int i = 0; i< planetas.size();i++){
                    System.out.println(i+"-"+planetas.get(i).getNombre());
                }
                int sat = Leer.leerEntero("De queplaneta quieres ver los satelites? ");
                ArrayList<Satelite> arraysat = planetas.get(sat).getSatelits();
                for (Satelite s:arraysat){
                    s.mostrarinfo();
                }
            }
            if (menu == 5){
                for (int i = 0; i< planetas.size();i++){
                    System.out.println(i+"-"+planetas.get(i).getNombre());
                }
                int eliminar = Leer.leerEntero("Elige el numero que quieras eliminar ");
                planetas.remove(eliminar);
            }
            if (menu == 6){
                planetas.clear();
            }
            if (menu == 7){
                av = false;
            }
        }
    }
}