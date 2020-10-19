package p8e1.Comparadores;

import p8e1.ElementoSA;

import java.util.Comparator;

public class ComparadorFechaCreacion implements Comparator<ElementoSA> {

    @Override
    public int compare(ElementoSA e1, ElementoSA e2) {
        return e1.getFechaCreacion().compareTo(e2.getFechaCreacion());
    }
}
