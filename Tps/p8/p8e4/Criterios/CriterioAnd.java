package p8.p8e4.Criterios;

import p8.p8e4.Noticia;

public class CriterioAnd implements Criterio {
    private Criterio c1;
    private Criterio c2;

    public CriterioAnd (Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return this.c1.cumple(noticia) && this.c2.cumple(noticia);
    }
}
