package p8e1.Criterios;

import p8e1.ElementoSA;

public class CriterioTituloContiene implements Criterio {
    private String palabra;

    public CriterioTituloContiene (String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getNombre().contains(this.palabra);
    }
}
