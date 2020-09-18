package p6e1;

public abstract class AceptaContrato {
    private Contrato contrato;

    public AceptaContrato (Contrato contrato) {
        this.contrato = contrato;
    }
    public abstract boolean acepta (Candidato candidato);
    public Contrato getContrato() {
        return this.contrato;
    }

}
