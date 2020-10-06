package p6e2;

public class EstacionMeteorologicaVelaYAzul extends EstacionMetereologica {
    double porcentajeHumedad;

    public EstacionMeteorologicaVelaYAzul (double porcentajeHumedad) {
        super();
        this.porcentajeHumedad = porcentajeHumedad;
    }

    @Override
    public boolean llueveEnLaProximaHora() {
        return this.getRegistros().get(this.getRegistros().size() - 1).getPorcentajeHumedad() > this.porcentajeHumedad;
    }

}
