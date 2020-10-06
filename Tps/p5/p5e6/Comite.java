package p5e6;

import java.util.ArrayList;

public class Comite {
    private ArrayList<Trabajo> trabajos;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<String> conocimientosEvaluadorGeneral;
    private ArrayList<String> conocimientosEvaluadorExperto;

    public Comite () {
        this.trabajos = new ArrayList<>();
        this.evaluadores = new ArrayList<>();
        this.conocimientosEvaluadorGeneral = new ArrayList<>();
        this.conocimientosEvaluadorExperto = new ArrayList<>();
    }

    public void agregarTrabajo (Trabajo trabajo) {
        this.trabajos.add(trabajo);
    }
    public void agregarEvaluador (Evaluador evaluador) {
        this.evaluadores.add(evaluador);
    }
    public void agregarConocimientoGeneral (String conocimiento) {
        this.conocimientosEvaluadorGeneral.add(conocimiento);
    }
    public void agregarConocimientoExperto (String conocimiento) {
        this.conocimientosEvaluadorExperto.add(conocimiento);
    }
    public ArrayList asignarEvaluador (Trabajo trabajo) {
        ArrayList<Evaluador> posibles = new ArrayList<>();
        for (Evaluador evaluador:this.evaluadores) {
            if (trabajo.seLePuedeAsignarEvaluador(evaluador)) {
                posibles.add(evaluador);
            }
        }
        return posibles;
    }
    public ArrayList asignarTrabajo (Evaluador evaluador) {
        ArrayList<Trabajo> posibles = new ArrayList<>();
        for (Trabajo trabajo: this.trabajos) {
            if (trabajo.seLePuedeAsignarEvaluador(evaluador)) {
                posibles.add(trabajo);
            }
        }
        return posibles;
    }
    public void agregarTrabajoAEvaluador (Trabajo trabajo, Evaluador evaluador) {
        if (trabajo.seLePuedeAsignarEvaluador(evaluador)) {
            evaluador.agregarTrabajo(trabajo);
        }
    }
    public boolean evaluadorEsExpreto (Evaluador evaluador) {
        int i = 0;
        for (String conocimiento:this.conocimientosEvaluadorExperto) {
            if (evaluador.getConocimientos().contains(conocimiento)) {
                i++;
            }

        }
        return i == this.conocimientosEvaluadorExperto.size();
    }
}
