package p8.p8e4.Criterios;

import p8.p8e4.Noticia;

public class CriterioAutorEs implements Criterio{
    private String autor;

    public CriterioAutorEs (String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().equals(this.autor);
    }
}
