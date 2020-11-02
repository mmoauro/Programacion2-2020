package Censado.Criterios;

import Censado.Comarca;

public class CriterioNot implements Criterio {
    private Criterio c;

    public CriterioNot (Criterio c) {
        this.c = c;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return !this.c.cumple(comarca);
    }
}
