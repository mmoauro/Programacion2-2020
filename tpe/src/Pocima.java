public abstract class Pocima {
    private String nombre;

    public Pocima (String nombre) {
        this.nombre = nombre;
    }

    public abstract void cambairValores (Carta c);

    public String toString () {
        return this.nombre;
    }
}
