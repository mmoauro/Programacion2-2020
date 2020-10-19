package p8e1.Criterios;

import p8e1.ElementoSA;

public class CriterioNot implements Criterio {
    private Criterio c1;

    public CriterioNot (Criterio c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return !c1.cumple(elem);
    }
}
