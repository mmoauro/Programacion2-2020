package p7.p7e3;

public class Libro implements Comparable<Libro> {
    private static int cantLibros = 0;
    private int ISBN;
    private String autor;
    private int anioEdicion;
    private String generoPincipal;
    private String titulo;
    private Comparable comparador;

    public Libro (String titulo, String autor, int anioEdicion, String generoPincipal) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
        this.generoPincipal = generoPincipal;
        this.ISBN = cantLibros;
        this.comparador = ISBN;
        cantLibros++;
    }
    public Comparable getComparador () {
        return this.comparador;
    }
    public void setComparador (Comparable comparador) {
        this.comparador = comparador;
    }
    public String getAutor () {
        return this.autor;
    }
    public int getAnio () {
        return this.anioEdicion;
    }
    public String getGeneroPincipal () {
        return this.generoPincipal;
    }

    @Override
    public int compareTo(Libro libro) {
        return this.getComparador().compareTo(libro.getComparador());
    }
    public String toString () {
        return (String) this.titulo;
    }
}
