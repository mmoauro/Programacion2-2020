package p8.p8e4.Criterios;

import p8.p8e4.Noticia;

public class CriterioNot implements Criterio {
    private Criterio c;

    public CriterioNot (Criterio c) {
        this.c = c;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return !this.c.cumple(noticia);
    }
}
