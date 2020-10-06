package p2e2;
public class Encuesta {
    String [] preguntas;
    Encuestado encuestado;
    Encuestador encuestador;

    public Encuesta (String [] preguntas, Encuestador encuestador){
        this.preguntas = preguntas;
    }
    public void setEncuestado (Encuestado encuestado) {
        this.encuestado = encuestado;
    }
}