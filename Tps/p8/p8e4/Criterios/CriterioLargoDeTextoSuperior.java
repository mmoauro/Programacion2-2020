package p8.p8e4.Criterios;

import p8.p8e4.Noticia;

public class CriterioLargoDeTextoSuperior implements Criterio {
    private int largo;

    public CriterioLargoDeTextoSuperior (int largo) {
        this.largo = largo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getLargoTexto() > this.largo;
    }
}
