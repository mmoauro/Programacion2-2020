package p6e7;

public class BusquedaTitulo extends Busqueda {
    private String titulo;

    public BusquedaTitulo (String titulo) {
        super();
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().equals(titulo);
    }
}
