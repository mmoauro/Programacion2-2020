package p8.p8e5.Criterio;

import p8.p8e5.GastoAbs;

public class CriterioNot implements Criterio{
    private Criterio c;

    public CriterioNot (Criterio c) {
        this.c = c;
    }

    @Override
    public boolean cumple(GastoAbs gasto) {
        return !c.cumple(gasto);
    }
}
