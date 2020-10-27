package p8.p8e5.Criterio;

import p8.p8e5.Caracteristica;
import p8.p8e5.GastoAbs;

public class CriterioCaracteristicaMayor implements Criterio {
    private Caracteristica caracteristica;

    public CriterioCaracteristicaMayor (Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumple(GastoAbs gasto) {
        if (gasto.contieneCaracteristica(this.caracteristica)) {
            return gasto.getCaracteristica(this.caracteristica.getNombre()).getValor().compareTo(this.caracteristica.getValor()) > 0;
        }
        return false;
    }
}
