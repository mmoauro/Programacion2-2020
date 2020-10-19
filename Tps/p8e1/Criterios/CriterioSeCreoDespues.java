package p8e1.Criterios;

import p8e1.ElementoSA;

import java.time.LocalDate;

public class CriterioSeCreoDespues implements Criterio {
    private LocalDate fecha;

    public CriterioSeCreoDespues(LocalDate fecha){
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getFechaCreacion().compareTo(this.fecha) > 0;
    }
}
