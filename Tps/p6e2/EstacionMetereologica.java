package p6e2;

import java.util.ArrayList;

public abstract class EstacionMetereologica {
    private double temperatura;
    private double porcentajeHumedad;
    private double velocidadViento;
    private ArrayList<Double> lluviaRegistrada;
    private ArrayList<Registro> registros;

    public EstacionMetereologica () {
        this.lluviaRegistrada = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public abstract boolean llueveEnLaProximaHora ();

    public void addRegistro () {
        double promedioLluvia = 0;
        for (double cant:this.lluviaRegistrada) {
            promedioLluvia+=cant;
        }
        registros.add(new Registro(this.temperatura, this.porcentajeHumedad, this.velocidadViento, promedioLluvia / this.lluviaRegistrada.size()));
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPorcentajeHumedad() {
        return porcentajeHumedad;
    }

    public void setPorcentajeHumedad(double porcentajeHumedad) {
        this.porcentajeHumedad = porcentajeHumedad;
    }

    public double getVelocidadViento() {
        return velocidadViento;
    }

    public void setVelocidadViento(double velocidadViento) {
        this.velocidadViento = velocidadViento;
    }

    public ArrayList<Double> getLluviaRegistrada() {
        return lluviaRegistrada;
    }

    public void addLluviaRegistrada(double lluviaRegistrada) {
        this.lluviaRegistrada.add(lluviaRegistrada);
    }

    public ArrayList<Registro> getRegistros () {
        return this.registros;
    }

}
