package p6e7;

public class BusquedaTituloContienePalabra extends Busqueda {

    private String palabra;

    public BusquedaTituloContienePalabra (String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().contains(palabra);
    }
}
