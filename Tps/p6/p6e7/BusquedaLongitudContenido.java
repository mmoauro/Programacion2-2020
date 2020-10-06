package p6e7;

public class BusquedaLongitudContenido extends Busqueda {
    private int palabras;

    public BusquedaLongitudContenido (int palabras) {
        if (palabras > 0) {
            this.palabras = palabras;
        }
        else {
            this.palabras = 20;
        }
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getContenido().length() > palabras;
    }
}
