package p6e1;

public class AceptaContratoSueldo extends AceptaContrato {

    public AceptaContratoSueldo (Contrato contrato) {
        super(contrato);
    }

    @Override
    public boolean acepta(Candidato candidato) {
        return this.getContrato().getSueldo() >= candidato.getSueldo();
    }
}
