package p8.p8e2;

import java.util.ArrayList;

public class Localidad {
    private String nombre;
    private ArrayList<Barrio> barrios;

    public Localidad (String nombre) {
        this.nombre = nombre;
        this.barrios = new ArrayList<>();
    }

    public void addBarrio (Barrio barrio) {
        this.barrios.add(barrio);
    }

    public int getCantidadVotosCandidato (CandidatoPresi candidato) {
        int votos = 0;
        for (Barrio barrio : this.barrios) {
            votos += barrio.getCantidadVotosCandidato(candidato);
        }
        return votos;
    }

    public int getCantidadVotosBlanco () {
        int votos = 0;
        for (Barrio barrio : this.barrios) {
            votos += barrio.getCantidadVotosBlanco();
        }
        return votos;
    }

    public int getCantidadVotos () {
        int votos = 0;
        for (Barrio barrio : this.barrios) {
            votos += barrio.getCantidadVotos();
        }
        return votos;
    }
}
