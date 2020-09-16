package p6e1;

public class CandidadoEmpresa extends Candidato {

    public CandidadoEmpresa (String nombre, double sueldo, String empresa) {
        super(nombre, sueldo, empresa);
    }

    @Override
    public boolean puedoAceptarContrato(Contrato contrato) {
        return contrato.getEmpresa() != this.getEmpresa();
    }
}
