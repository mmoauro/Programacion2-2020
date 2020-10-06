package p4e1;

public class Alarma {
    private Sensor sensorCocina;
    private Timbre timbre;

    public Alarma () {
        this.sensorCocina = new Sensor("Cocina");
        this.timbre = new Timbre();
    }
    public boolean comprobar () {
        if (this.sensorCocina.getSensorFueActivado()) {
            this.timbre.sonar();
            System.out.println(this.sensorCocina.getZona());
            return true;
        }
        return false;
    }
}
