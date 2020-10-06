package p5e6;

import java.util.ArrayList;

public class Evaluador {
    private ArrayList<String> conocimientos;
    private ArrayList<Trabajo> trabajos;

    public Evaluador () {
        this.conocimientos = new ArrayList<>();
        this.trabajos = new ArrayList<>();
    }
    public void agregarConocimiento (String conocimiento) {
        this.conocimientos.add(conocimiento);
    }
    public ArrayList getConocimientos () {
        return this.conocimientos;
    }
    public int getCantidadDeTrabajos () {
        return this.trabajos.size();
    }
    public void agregarTrabajo (Trabajo trabajo) {
        this.trabajos.add(trabajo);
    }
}
