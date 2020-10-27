package p8.p8e6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class TareaTerminal implements TareaAbs {
    private ArrayList<Recurso> recursos;
    private LocalDate fechaEstimadaInicio;
    private LocalDate fechaInicioReal;
    private LocalDate fechaFinalizacionEstimada;
    private LocalDate fechaFinalizacionReal;
    private String estado;

    public TareaTerminal (LocalDate fechaEstimadaInicio, LocalDate fechaFinalizacionEstimada) {
        this.recursos = new ArrayList<>();
        this.fechaEstimadaInicio = fechaEstimadaInicio;
        this.fechaFinalizacionEstimada = fechaFinalizacionEstimada;
        this.estado = "En proceso";
    }

    public void addRecurso (Recurso recurso) {
        if (!recurso.getEnUso() && !recurso.esExclusivo() && !this.recursos.contains(recurso))
            this.recursos.add(recurso);
    }

    public void terminarTarea () {
        this.fechaFinalizacionReal = LocalDate.now();
        this.estado = "Completada";
    }

    @Override
    public ArrayList<TareaAbs> getTareasAtrasadas() {
        ArrayList<TareaAbs> retorno = new ArrayList<>();
        if (this.fechaFinalizacionEstimada.compareTo(LocalDate.now()) > 0)
            retorno.add(this);
        return retorno;
    }

    @Override
    public ArrayList<TareaAbs> getTareasUsanRecurso(Recurso recurso) {
        ArrayList<TareaAbs> retorno = new ArrayList<>();
        if (this.recursos.contains(recurso))
            retorno.add(this);
        return retorno;
    }

    @Override
    public ArrayList<Recurso> getRecursos() {
        ArrayList<Recurso> retorno = new ArrayList<>();
        for (Recurso r:this.recursos) {
            retorno.add(r);
        }
        return retorno;
    }

    @Override
    public Period getFechaDuracionEstimada() {
        Period p = this.fechaEstimadaInicio.until(this.fechaFinalizacionEstimada);
        return p;
    }

}
