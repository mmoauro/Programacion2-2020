package p8.p8e1.Criterios;

import p8.p8e1.ElementoSA;

import java.time.LocalDate;

public class CriterioSeCreoAntes implements Criterio {
    private LocalDate fecha;

    public CriterioSeCreoAntes (LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getFechaCreacion().compareTo(this.fecha) < 0;
    }
}
