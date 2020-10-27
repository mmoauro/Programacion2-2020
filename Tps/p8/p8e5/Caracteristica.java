package p8.p8e5;

public class Caracteristica {
    private String nombre;
    private Comparable valor;

    public Caracteristica (String nombre, Comparable valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public Comparable getValor() {
        return valor;
    }
}
