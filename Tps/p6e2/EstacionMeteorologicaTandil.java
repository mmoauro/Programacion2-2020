package p6e2;

public class EstacionMeteorologicaTandil extends EstacionMetereologica {
    double promedioTempNecesario;
    double promerioPrecNecesario;

    public EstacionMeteorologicaTandil() {
        super();
    }

    @Override
    public boolean llueveEnLaProximaHora() {
        double precipitaciones = 0;
        double temperatuda = 0;
        int i = 0;
        int j = 0;

        while (i < this.getRegistros().size() && i < 12) {
            temperatuda+=this.getRegistros().get(i).getTemperatura();
            if (j < 8) {
                precipitaciones+=this.getRegistros().get(i).getCantidadLluvia();
            }
            i++;
            j++;
        }

        return precipitaciones / j < this.promerioPrecNecesario && temperatuda / i > this.promedioTempNecesario;
    }
}
