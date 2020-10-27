package p8.p8e2;

public abstract  class ElementoSistemaElectoral {
    public abstract int getCantidadVotos();
    public abstract int getCantidadVotosBlanco ();
    public abstract int getCantidadVotosCandidato (CandidatoPresi candidato);

    public double getPorcentajeVotosCandidato (CandidatoPresi candidato) {
        int totalVotos = this.getCantidadVotos();
        int votosCandidato = this.getCantidadVotosCandidato(candidato);

        return ((double) totalVotos / (double) votosCandidato) * 100;
    }
}
