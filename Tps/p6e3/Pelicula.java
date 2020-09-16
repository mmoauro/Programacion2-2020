package p6e3;

public class Pelicula extends Producto {
    private String titulo;
    private int copias;

    public Pelicula(String titulo, int copias) {
        super();
        this.titulo = titulo;
        this.copias = copias;
    }

    public void addCopia () {
        this.copias++;
    }
    public void deleteCopia () {
        this.copias--;
    }
    public void setEstoyAlquilado () {
        super.setEstoyAlquilado();
        this.deleteCopia();
    }

    @Override
    public boolean mePuedenAlquilar() {
        return this.copias > 0;
    }
}
