package p6e7;

import java.util.ArrayList;

public class BusquedaOr extends Busqueda {
    private ArrayList<Busqueda> busquedas;

    public BusquedaOr (ArrayList<Busqueda> busquedas) {
        this.busquedas = busquedas;
    }

    @Override
    public boolean cumple(Documento documento) {
        for (Busqueda busqueda:this.busquedas) {
            if (busqueda.cumple(documento)) {
                return true;
            }
        }
        return false;
    }
}
