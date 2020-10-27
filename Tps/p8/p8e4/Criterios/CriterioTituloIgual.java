package p8.p8e4.Criterios;

import p8.p8e4.Noticia;

public class CriterioTituloIgual implements Criterio{
    private String palabra;

    public CriterioTituloIgual (String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getNombre().equals(this.palabra);
    }
}
