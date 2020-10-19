package p8e1;

import p8e1.Criterios.Criterio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SistemaArchivos {
    private ArrayList<ElementoSA> archivos;

    public SistemaArchivos () {
        this.archivos = new ArrayList<>();
    }

    public ArrayList<ElementoSA> buscar (Criterio criterio, Comparator<ElementoSA> comparador, int orden) {
        ArrayList<ElementoSA> retorno = new ArrayList<>();
        for (ElementoSA elem:this.archivos)
            retorno.addAll(elem.buscar(criterio));
        if (orden > 0) {
            Collections.sort(retorno, comparador);
        }
        else {
            Collections.sort(retorno, comparador.reversed());
        }
        return retorno;
    }
}
