package p6e7;

public class BusquedaContenido extends Busqueda {

    private String contenido;
    public BusquedaContenido (String contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getContenido().contains(contenido);
    }
}
