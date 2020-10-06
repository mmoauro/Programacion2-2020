package p6e2;

public class EstacionMeteorologicaBahia extends EstacionMetereologica {
    double limiteVeloidadViento;
    double limiteLluviaRegistrada;
    double limiteHumedadPromedio;
    int cantidadRegistros;

    public EstacionMeteorologicaBahia(double limiteVeloidadViento, double limiteLluviaRegistrada, double limiteHumedadPromedio, int cantidadRegistros) {
        this.limiteVeloidadViento = limiteVeloidadViento;
        this.limiteLluviaRegistrada = limiteLluviaRegistrada;
        this.limiteHumedadPromedio = limiteHumedadPromedio;
        this.cantidadRegistros = cantidadRegistros;
    }

    @Override
    public boolean llueveEnLaProximaHora() {
        double humedad = 0;
        double promedioHumedad = 0;
        int i = 0;

        while (i < this.getRegistros().size() && i < this.cantidadRegistros) {
            humedad+=this.getRegistros().get(i).getPorcentajeHumedad();
            i++;
        }
        promedioHumedad = humedad / i;
        return this.getRegistros().get(this.getRegistros().size() - 1).getVelocidadViento() > this.limiteVeloidadViento && promedioHumedad < this.limiteHumedadPromedio && this.getRegistros().get(this.getRegistros().size() - 1).getCantidadLluvia() < this.limiteLluviaRegistrada;

    }
}
