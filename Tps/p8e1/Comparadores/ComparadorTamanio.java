package p8e1.Comparadores;

import p8e1.ElementoSA;

import java.util.Comparator;

public class ComparadorTamanio implements Comparator<ElementoSA> {

    @Override
    public int compare(ElementoSA e1, ElementoSA e2) {
        return (int) (e1.getTamanio() - e2.getTamanio());
    }
}
