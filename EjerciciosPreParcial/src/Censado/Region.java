package Censado;

import Censado.Criterios.Criterio;

import java.util.ArrayList;
import java.util.Collections;

public class Region extends LugarAbstracto {
    private ArrayList<Comarca> comarcas;

    public Region (String nombre) {
        super(nombre);
        this.comarcas = new ArrayList<>();
    }

    @Override
    public int getCantHabitantes() {
        int total = 0;
        for (Comarca c:this.comarcas) {
            total += c.getCantHabitantes();
        }
        return total;
    }

    @Override
    public double getSuperficieTotal() {
        double total = 0;
        for (Comarca c:this.comarcas) {
            total += c.getSuperficieTotal();
        }
        return total;
    }

    @Override
    public double getTotalIngresos() {
       double total = 0;
        for (Comarca c:this.comarcas){
            total += c.getTotalIngresos();
        }
        return total;
    }

    @Override
    public ArrayList<Comarca> getComarcasCriterio(Criterio c) {
        ArrayList<Comarca> retorno = new ArrayList<>();
        for (Comarca comarca:this.comarcas) {
            retorno.addAll(comarca.getComarcasCriterio(c));
        }
        Collections.sort(retorno);
        return retorno;
    }


}
