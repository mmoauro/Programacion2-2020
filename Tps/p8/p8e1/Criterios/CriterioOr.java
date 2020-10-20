package p8.p8e1.Criterios;

import p8.p8e1.ElementoSA;

public class CriterioOr implements Criterio{
    private Criterio c1;
    private Criterio c2;

    public CriterioOr (Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return this.c1.cumple(elem) || this.c2.cumple(elem);
    }
}
