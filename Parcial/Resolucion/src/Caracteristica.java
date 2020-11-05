public class Caracteristica implements Comparable<Caracteristica>{
    private String nombre;
    private Comparable valor;

    public Caracteristica (String nombre, Comparable valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Comparable getValor() {
        return this.valor;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Caracteristica otra = (Caracteristica) obj;
            return this.getNombre().equals(otra.getNombre());
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public int compareTo(Caracteristica o) {
        return this.getValor().compareTo(o.getValor());
    }
}
