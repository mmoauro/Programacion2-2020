package p2e2;
import java.util.ArrayList;
public class Encuestado {
    String nombre;
    String dni;
    ArrayList<Encuesta> encuestasRealizadas = new ArrayList<Encuesta>();

    public Encuestado (String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombre () {
        return this.nombre;
    }
    public String getDni () {
        return this.dni;
    }
    public void setEncuestaRealizada (Encuesta encuesta) {
        this.encuestasRealizadas.add(encuesta);
    }
    public boolean yaRealizoLaEncuesta (Encuesta encuesta) {
        int i = 0;
        for (Encuesta encuesta2 : encuestasRealizadas) {
            if (encuesta2 == encuesta) {
                i++;
            }
        }
        return i != 0;
    }
}