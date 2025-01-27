package p6e1;

import java.util.ArrayList;

public class Consultora {
    private ArrayList<Contrato> contratos;
    private ArrayList<Candidato> candidatos;

    public Consultora () {
        this.contratos= new ArrayList<>();
        this.candidatos = new ArrayList<>();
    }
    public void addContraro (Contrato contrato) {
        this.contratos.add(contrato);
    }
    public void addCandidato (Candidato candidato) {
        this.candidatos.add(candidato);
    }

    public ArrayList<Candidato> candidadosParaUnContrato (AceptaContrato formaAceptacion) {
        ArrayList<Candidato> candidatos = new ArrayList<>();
        for (Candidato candidato:this.candidatos) {
            if (formaAceptacion.acepta(candidato)) {
                candidatos.add(candidato);
            }
        }
        return candidatos;
    }
}
