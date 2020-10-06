package p7.p7e4;

public class Caratcteristica implements Comparable<Caratcteristica> {
    private String nombre;
    private Comparable valor;

    public Caratcteristica (String nombre, Comparable valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public Comparable getValor() {
        return valor;
    }
    public boolean equals (Object o) {
        try {
            Caratcteristica nueva = (Caratcteristica) o;
            return nueva.getNombre().equals(this.getNombre());
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public int compareTo(Caratcteristica o) {
        return this.getValor().compareTo(o.getValor());
    }
}
