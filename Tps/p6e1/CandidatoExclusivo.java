package p6e1;

public class CandidatoExclusivo extends Candidato {

    public CandidatoExclusivo(String nombreCompleto, double sueldo, String empresa) {
        super(nombreCompleto, sueldo, empresa);
    }

    @Override
    public boolean puedoAceptarContrato(Contrato contrato) {
        return false;
    }
}
