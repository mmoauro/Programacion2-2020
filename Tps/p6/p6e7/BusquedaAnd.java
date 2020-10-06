package p6e7;

import java.util.ArrayList;

public class BusquedaAnd extends Busqueda {
    ArrayList<Busqueda> busquedas;

    public  BusquedaAnd (ArrayList<Busqueda> busquedas) {
        this.busquedas = busquedas;
    }
    @Override
    public boolean cumple(Documento documento) {
        for (Busqueda busqueda:this.busquedas) {
            if (!busqueda.cumple(documento)) {
                return false;
            }
        }
        return true;
    }
}
