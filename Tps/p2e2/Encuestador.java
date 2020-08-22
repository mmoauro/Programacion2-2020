package p2e2;
public class Encuestador {
    String nombre;
    int cantidadEncuestasRealizadas;

    public Encuestador (String nombre) {
        this.nombre = nombre;
        this.cantidadEncuestasRealizadas = 0;
    }
    public void agregarEncuesta () {
        this.cantidadEncuestasRealizadas++;
    }
    public int getCantidadEncuestas () {
        return this.cantidadEncuestasRealizadas;
    }
    public String getNombre () {
        return this.nombre;
    }
}