public abstract class Pocima {
    private String nombre;

    public Pocima (String nombre) {
        this.nombre = nombre;
    }

    public abstract double getValorAtributo (Atributo atr);

    public String toString () {
        return this.nombre;
    }
}
