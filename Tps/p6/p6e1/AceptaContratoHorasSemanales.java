package p6e1;

public class AceptaContratoHorasSemanales extends AceptaContrato {
    private int horasMinimasQueAcepta;

    public AceptaContratoHorasSemanales (Contrato contrato, int horasMinimasQueAcepta) {
        super(contrato);
        this.horasMinimasQueAcepta = horasMinimasQueAcepta;
    }

    @Override
    public boolean acepta(Candidato candidato) {
        return this.getContrato().getHorasSemanales() >= this.horasMinimasQueAcepta;
    }
}
