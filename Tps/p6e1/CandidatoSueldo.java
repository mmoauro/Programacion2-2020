package p6e1;

public class CandidatoSueldo extends Candidato {

    public CandidatoSueldo(String nombreCompleto, double sueldo, String empresa) {
        super(nombreCompleto, sueldo, empresa);
    }

    @Override
    public boolean puedoAceptarContrato(Contrato contrato) {
        return contrato.getSueldo() >= this.getSueldo();
    }
}
