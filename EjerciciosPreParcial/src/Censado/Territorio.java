package Censado;

import Censado.Criterios.Criterio;

import java.util.ArrayList;
import java.util.Collections;

public class Territorio extends LugarAbstracto {
    private ArrayList<LugarAbstracto> lugares;

    public Territorio (String nombre) {
        super(nombre);
        this.lugares = new ArrayList<>();
    }

    @Override
    public int getCantHabitantes() {
        int total = 0;
        for (LugarAbstracto lugar:this.lugares) {
            total += lugar.getCantHabitantes();
        }
        return total;
    }

    @Override
    public double getSuperficieTotal() {
        int total = 0;
        for (LugarAbstracto lugar:this.lugares) {
            total += lugar.getSuperficieTotal();
        }
        return total;
    }

    @Override
    public double getTotalIngresos() {
        int total = 0;
        for (LugarAbstracto lugar:this.lugares) {
            total += lugar.getTotalIngresos();
        }
        return total;
    }

    @Override
    public ArrayList<Comarca> getComarcasCriterio(Criterio c) {
        ArrayList<Comarca> retorno = new ArrayList<>();
        for (LugarAbstracto lugar:this.lugares) {
            retorno.addAll(lugar.getComarcasCriterio(c));
        }
        Collections.sort(retorno);
        return retorno;
    }


}
