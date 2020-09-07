package libreria;

public class ClienteExigente extends Cliente {

    public ClienteExigente (String nombreCompleto, String dni, String direccion) {
        super(nombreCompleto, dni, direccion);
    }

    @Override
    public boolean leGustaLibro(Libro libro) {
        return super.leGustaLibro(libro) && this.leGustaElAutor(libro.getAutor()) && this.leGustaGenero(libro.getGenero());
    }
}
