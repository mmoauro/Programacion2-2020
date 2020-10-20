package p8.p8e2;

import java.util.ArrayList;

public class Barrio {
    private String nombre;
    private ArrayList<LugarVotable> lugaresVotables;

    public Barrio (String nombre) {
        this.nombre = nombre;
        this.lugaresVotables = new ArrayList<>();
    }

    public int getCantidadVotosCandidato (CandidatoPresi candidato) {
        int votos = 0;
        for (LugarVotable lugar:this.lugaresVotables) {
            votos += lugar.getCantidadVotosCandidato(candidato);
        }
        return votos;
    }

    public int getCantidadVotosBlanco () {
        int votos = 0;
        for (LugarVotable lugar:this.lugaresVotables) {
            votos += lugar.getCantidadVotosBlanco();
        }
        return votos;
    }

    public int getCantidadVotos () {
        int votos = 0;
        for (LugarVotable lugar:this.lugaresVotables) {
            votos += lugar.getCantidadVotos();
        }
        return votos;
    }
}
