package p8.p8e5.Criterio;

import p8.p8e5.GastoAbs;

public class CriterioAnd implements Criterio {
    private Criterio c1;
    private Criterio c2;

    public CriterioAnd (Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(GastoAbs caracteristica) {
        return this.c1.cumple(caracteristica) && this.c2.cumple(caracteristica);
    }
}
