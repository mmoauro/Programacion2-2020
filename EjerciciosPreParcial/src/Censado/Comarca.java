package Censado;

import Censado.Criterios.Criterio;

import java.util.ArrayList;

public class Comarca extends LugarAbstracto implements Comparable<Comarca> {
    private double superficie;
    private int cantHabitantes;
    private double montoTotalIngresos;

    public Comarca (String nombre, double superficie, int cantHabitantes, double montoTotalIngresos) {
        super(nombre);
        this.superficie = superficie;
        this.cantHabitantes = cantHabitantes;
        this.montoTotalIngresos = montoTotalIngresos;
    }

    public double getDensidad () {
        return this.cantHabitantes / this.superficie;
    }


    @Override
    public int getCantHabitantes() {
        return this.getCantHabitantes();
    }

    @Override
    public double getSuperficieTotal() {
        return this.superficie;
    }

    @Override
    public double getTotalIngresos() {
        return this.montoTotalIngresos;
    }

    @Override
    public ArrayList<Comarca> getComarcasCriterio(Criterio c) {
        ArrayList<Comarca> retorno = new ArrayList<>();
        if (c.cumple(this))
            retorno.add(this);
        return retorno;
    }

    @Override
    public int compareTo(Comarca o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
