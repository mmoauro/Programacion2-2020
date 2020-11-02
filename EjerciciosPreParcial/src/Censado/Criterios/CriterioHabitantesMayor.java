package Censado.Criterios;

import Censado.Comarca;

public class CriterioHabitantesMayor implements Criterio {
    private int numero;

    public CriterioHabitantesMayor (int numero) {
        this.numero = numero;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return comarca.getCantHabitantes() > this.numero;
    }
}
