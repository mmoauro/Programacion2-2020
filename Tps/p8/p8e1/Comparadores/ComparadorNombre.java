package p8.p8e1.Comparadores;

import p8.p8e1.ElementoSA;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<ElementoSA> {

    @Override
    public int compare(ElementoSA e1, ElementoSA e2) {
        return e1.getNombre().compareTo(e2.getNombre());
    }
}
