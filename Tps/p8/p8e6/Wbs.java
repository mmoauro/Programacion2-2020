package p8.p8e6;

import java.time.Period;
import java.util.ArrayList;

public class Wbs implements TareaAbs {
    private String nombre;
    private ArrayList<TareaAbs> tareas;

    public Wbs (String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void addTarea (TareaAbs tarea) {
        if (!this.tareas.contains(tarea))
            this.tareas.add(tarea);
    }

    @Override
    public ArrayList<TareaAbs> getTareasAtrasadas() {
        ArrayList<TareaAbs> retorno = new ArrayList<>();
        for (TareaAbs tarea:this.tareas) {
            retorno.addAll(tarea.getTareasAtrasadas());
        }
        return retorno;
    }

    @Override
    public ArrayList<TareaAbs> getTareasUsanRecurso(Recurso recurso) {
        ArrayList<TareaAbs> retorno = new ArrayList<>();
        for (TareaAbs tarea:this.tareas) {
            retorno.addAll(tarea.getTareasUsanRecurso(recurso));
        }
        return retorno;
    }

    @Override
    public ArrayList<Recurso> getRecursos() {
        ArrayList<Recurso> recursos = new ArrayList<>();
        ArrayList<Recurso> retorno = new ArrayList<>();
        for (TareaAbs tarea:this.tareas) {
            recursos.addAll(tarea.getRecursos());
        }
        for (Recurso r: recursos) {
            recursos.remove(r);
            if (!recursos.contains(r));
            retorno.add(r);
        }
        return retorno;
    }

    @Override
    public Period getFechaDuracionEstimada() {
        Period p = null;
        for (TareaAbs tarea:this.tareas) {
            if (1 == 1)//tarea tiene periodo de tiempo mas grande...
                p = tarea.getFechaDuracionEstimada();
        }
        return p;
    }


}
