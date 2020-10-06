package p6e1;

public class AceptaContratoSiNoEsMismaEmpresa extends AceptaContrato {

    public AceptaContratoSiNoEsMismaEmpresa (Contrato contrato) {
        super(contrato);
    }

    @Override
    public boolean acepta(Candidato candidato) {
        return !candidato.getEmpresa().equals(this.getContrato().getEmpresa());
    }
}
