package p6e1;

public class CandidatoHorasSemanales extends Candidato {
    int horasMinimasContrato;

    public CandidatoHorasSemanales (String nombreCompleto, double sueldo, String empresa, int horasMinimasContrato) {
        super(nombreCompleto, sueldo, empresa);
        this.horasMinimasContrato = horasMinimasContrato;
    }

    @Override
    public boolean puedoAceptarContrato(Contrato contrato) {
        return  contrato.getHorasSemanales() >= this.horasMinimasContrato;
    }
}
