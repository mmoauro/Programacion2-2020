package p6e2;

public class Registro {
    private double temperatura;
    private double porcentajeHumedad;
    private double velocidadViento;
    private double cantidadLluvia;

    public Registro(double temperatura, double porcentajeHumedad, double velocidadViento, double cantidadLluvia) {
        this.temperatura = temperatura;
        this.porcentajeHumedad = porcentajeHumedad;
        this.velocidadViento = velocidadViento;
        this.cantidadLluvia = cantidadLluvia;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getPorcentajeHumedad() {
        return porcentajeHumedad;
    }

    public double getVelocidadViento() {
        return velocidadViento;
    }

    public double getCantidadLluvia() {
        return cantidadLluvia;
    }
}
