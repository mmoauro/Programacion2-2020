package Censado.Criterios;

import Censado.Comarca;

public class CriterioOr implements Criterio {
    private Criterio c1;
    private Criterio c2;

    public CriterioOr (Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return c1.cumple(comarca) || c2.cumple(comarca);
    }
}