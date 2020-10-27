package p8.p8e2;

import java.util.ArrayList;

public class Mesa extends ElementoSistemaElectoral {
    private ArrayList<Persona> padron;
    private ArrayList<Voto> votos;

    public Mesa (ArrayList<Persona> padron) {
        this.padron = padron;
        this.votos = new ArrayList<>();
    }

    public boolean personaPuedeVotar (Persona persona) {
        return this.padron.contains(persona);
    }

    public void votar (Persona persona, CandidatoPresi candidato) {
        if (this.personaPuedeVotar(persona)) {
            this.votos.add(new Voto(candidato));
            candidato.addVoto();
        }
    }

    public int getCantidadVotosCandidato (CandidatoPresi candidato) {
        int votos = 0;
        for (Voto voto:this.votos) {
            if (voto.getCandidato().equals(candidato))
                votos++;
        }
        return votos;
    }

    public int getCantidadVotosBlanco () {
        int votos = 0;
        for (Voto voto:this.votos) {
            if (voto.getCandidato() == null)
                votos++;
        }
        return votos;
    }

    public int getCantidadVotos () {
        return this.votos.size();
    }
}
