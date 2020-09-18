package p6e7;

public class BusquedaPalabraClave extends Busqueda{
    private String palabra;

    public BusquedaPalabraClave (String palabra) {
        this.palabra = palabra;
    }
    @Override
    public boolean cumple(Documento documento) {
        return documento.getPalabrasClave().contains(palabra);
    }
}
