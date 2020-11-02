package Censado;

import Censado.Criterios.Criterio;

import java.util.ArrayList;

public abstract class LugarAbstracto {
    // Puede ser un territorio, region, o comarca.
    private String nombre;

    public LugarAbstracto (String nombre) {
        this.nombre = nombre;
    }

    public abstract int getCantHabitantes ();
    public abstract double getSuperficieTotal();
    public abstract double getTotalIngresos();
    public abstract ArrayList<Comarca> getComarcasCriterio(Criterio c);

    public double getIngresosPerCapita() {
        return this.getTotalIngresos() / this.getCantHabitantes();
    }

    public String getNombre () {
        return this.nombre;
    }



}
