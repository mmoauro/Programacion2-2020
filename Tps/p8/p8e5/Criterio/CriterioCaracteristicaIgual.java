package p8.p8e5.Criterio;

import p8.p8e5.Caracteristica;
import p8.p8e5.GastoAbs;

public class CriterioCaracteristicaIgual implements Criterio {
    private Caracteristica caracteristica;

    public CriterioCaracteristicaIgual (Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumple(GastoAbs gasto) {
        return gasto.contieneCaracteristica(this.caracteristica);
    }
}
