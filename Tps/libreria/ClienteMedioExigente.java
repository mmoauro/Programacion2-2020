package libreria;

public class ClienteMedioExigente extends Cliente {

    public ClienteMedioExigente (String nombreCompleto, String dni, String direccion) {
        super(nombreCompleto, dni, direccion);
    }

    public boolean leGustaLibro(Libro libro) {
        return super.leGustaLibro(libro) && this.leGustaElAutor(libro.getAutor());
    }
}
