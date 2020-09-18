package p6e7;

public class BusquedaNot extends Busqueda{
    private Busqueda busqueda;

    public BusquedaNot (Busqueda busqueda) {
        this.busqueda = busqueda;
    }

    @Override
    public boolean cumple(Documento documento) {
        return !this.busqueda.cumple(documento);
    }
}
