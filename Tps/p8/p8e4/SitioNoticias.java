package p8.p8e4;

import p8.p8e4.Criterios.Criterio;

import java.util.ArrayList;

public class SitioNoticias {
    private ArrayList<ElementoSitio> elementos;

    public SitioNoticias () {
        this.elementos = new ArrayList<>();
    }

    public void addElemento (ElementoSitio elem) {
        this.elementos.add(elem);
    }

    public int getCantidadNoticias () {
        int total = 0;
        for (ElementoSitio elem:this.elementos) {
            total += elem.getCantidadNoticias();
        }
        return total;
    }

    //Falta getRutas

    public ArrayList<ElementoSitio> getNoticiasCriterio (Criterio criterio) {
        ArrayList<ElementoSitio> retorno = new ArrayList<>();
        for (ElementoSitio elem: this.elementos)
            retorno.addAll(elem.getNoticiasCriterio(criterio));
        return retorno;

    }
}
