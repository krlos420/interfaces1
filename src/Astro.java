public abstract class Astro {

    private String nombre;
    private double radio;
    private double masa;
    private double densidad;
    private double rotacion;
    private double temperatura;
    private double gravedad;

    public Astro(String nombre, double radio, double masa, double densidad, double rotacion, double temperatura, double gravedad) {
        this.nombre = nombre;
        this.radio = radio;
        this.masa = masa;
        this.densidad = densidad;
        this.rotacion = rotacion;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
    }
    public static final double G = 6.672E-11;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
    public abstract void mostrarinfo();

    public Astro() {
    }
}

