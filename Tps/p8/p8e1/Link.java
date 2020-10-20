package p8.p8e1;

import p8.p8e1.Criterios.Criterio;

import java.util.ArrayList;

public class Link extends ElementoSA {
    private ElementoSA elementoApunto;
    public static final int tamanio = 1;

    public Link (String nombre, ElementoSA apunto) {
        super(nombre);
        this.elementoApunto = apunto;
    }

    @Override
    public double getTamanio() {
        return Link.tamanio;
    }

    @Override
    public ArrayList<ElementoSA> buscar(Criterio criterio) {
        ArrayList<ElementoSA> retorno = new ArrayList<>();
        if (criterio.cumple(this))
            retorno.add(this);
        return retorno;
    }
}
