package Censado.Criterios;

import Censado.Comarca;

public class CriterioDensidadMayor implements Criterio {
    private double densidad;

    public CriterioDensidadMayor (double densidad) {
        this.densidad = densidad;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return comarca.getDensidad() > this.densidad;
    }
}
