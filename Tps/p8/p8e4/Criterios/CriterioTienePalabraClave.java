package p8.p8e4.Criterios;

import p8.p8e4.Noticia;

public class CriterioTienePalabraClave implements Criterio {
    private String palabra;

    public CriterioTienePalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.tienePalabraClave(this.palabra);
    }
}
