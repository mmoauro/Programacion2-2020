package Censado.Criterios;

import Censado.Comarca;

public class CriterioNombreIgual implements Criterio {
    private String nombre;

    public CriterioNombreIgual (String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return comarca.getNombre().equals(this.nombre);
    }
}
