package p6e2;

public class EstacionMeteorologicaTandil extends EstacionMetereologica {
    double promedioTempNecesario;
    double promerioPrecNecesario;
    int cantidadRegistrosTemp;
    int cantidadRegistrosPrec;

    public EstacionMeteorologicaTandil(int cantidadRegistrosTemp, int cantidadRegistrosPrec, double promedioTempNecesario, double promerioPrecNecesario) {
        super();
        this.promedioTempNecesario = promedioTempNecesario;
        this.promerioPrecNecesario = promerioPrecNecesario;
        this.cantidadRegistrosTemp = cantidadRegistrosTemp;
        this.cantidadRegistrosPrec = cantidadRegistrosPrec;
    }

    @Override
    public boolean llueveEnLaProximaHora() {
        double precipitaciones = 0;
        double temperatuda = 0;
        int i = 0;
        int j = 0;

        while (i < this.getRegistros().size() && (i < cantidadRegistrosTemp || i < cantidadRegistrosPrec)) {
            if (i < cantidadRegistrosPrec) {
                precipitaciones+=this.getRegistros().get(i).getCantidadLluvia();
                j++;
            }
            if (i < cantidadRegistrosTemp) {
                temperatuda+=this.getRegistros().get(i).getTemperatura();
            }
            i++;
        }
        return precipitaciones / j < this.promerioPrecNecesario && temperatuda / i > this.promedioTempNecesario;
    }
}
