package p6e7;

public class BusquedaAutor extends Busqueda {
    private String autor;

    public BusquedaAutor (String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getAutores().contains(autor);
    }
}
