package p8.p8e2;

import java.time.LocalTime;

public class Voto {
    private CandidatoPresi candidato;
    private LocalTime horaVoto;

    public Voto (CandidatoPresi candidato) {
        this.candidato = candidato;
        this.horaVoto = LocalTime.now();
    }

    public CandidatoPresi getCandidato () {
        return this.candidato;
    }

    public LocalTime getHoraVoto () {
        return this.horaVoto;
    }
}
