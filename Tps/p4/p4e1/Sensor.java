package p4e1;

public class Sensor {
    private String zona;
    private boolean sensorFueActivado;

    public Sensor (String zona) {
        this.zona = zona;
        this.sensorFueActivado = true;
    }
    public String getZona () {
        return this.zona;
    }
    public boolean getSensorFueActivado () {
        return  this.sensorFueActivado;
    }
}
