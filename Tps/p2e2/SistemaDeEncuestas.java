package p2e2;
import java.util.ArrayList;
public class SistemaDeEncuestas {
    ArrayList<Encuesta> encuestas = new ArrayList<Encuesta>();
    ArrayList<Encuestador> encuestadores = new ArrayList<Encuestador>();
    ArrayList<Encuesta> encuestasRealizadas = new ArrayList<Encuesta>();

    public SistemaDeEncuestas () {
        
    }
    public void agregarEncuesta (Encuesta encuesta) {
        this.encuestas.add(encuesta);
    }
    public void agregarEncuestador (Encuestador encuestador) {
        this.encuestadores.add(encuestador);
    }

    public void realizarEncuesta (Encuesta encuesta, Encuestador encuestador, Encuestado encuestado) {
        if (!encuestado.yaRealizoLaEncuesta(encuesta)) {
            encuestador.agregarEncuesta();
            this.encuestasRealizadas.add(encuesta);
            encuestado.setEncuestaRealizada(encuesta);
            System.out.println("Encuesta realizada!");
        }
    }
    public void getEncuentas () {
        for (Encuesta encuesta : encuestas) {
            System.out.println(encuesta);
        }
    }


}