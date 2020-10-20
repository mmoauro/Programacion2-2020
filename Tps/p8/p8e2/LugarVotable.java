package p8.p8e2;

import java.util.ArrayList;

public class LugarVotable {
    private Barrio barrio;
    private ArrayList<Mesa> mesas;

    public LugarVotable (Barrio barrio) {
        this.barrio = barrio;
        this.mesas = new ArrayList<>();
    }

    public void addMesa (Mesa mesa) {
        if (!this.mesas.contains(mesa))
            this.mesas.add(mesa);
    }

    public int getCantidadVotosCandidato (CandidatoPresi candidato) {
        int votos = 0;
        for (Mesa mesa:this.mesas) {
            votos += mesa.getCantidadVotosCandidato(candidato);
        }
        return votos;
    }

    public int getCantidadVotosBlanco () {
        int votos = 0;
        for (Mesa mesa:this.mesas) {
            votos += mesa.getCantidadVotosBlanco();
        }
        return votos;
    }

    public int getCantidadVotos () {
        int votos = 0;
        for (Mesa mesa:this.mesas) {
            votos += mesa.getCantidadVotos();
        }
        return votos;
    }
}
