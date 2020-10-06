package p2e2;
public class Main {
    public static void main(String[] args) {
        SistemaDeEncuestas manolo = new SistemaDeEncuestas();
        Encuestador manuel = new Encuestador("Manuel Moauro");
        Encuestado pelu = new Encuestado("Pelu", "123456");
        String [] preguntas = {"Como andas?"};
        Encuesta primera = new Encuesta(preguntas, manuel);
        manolo.agregarEncuesta(primera);
        manolo.agregarEncuestador(manuel);
        manolo.realizarEncuesta(primera, manuel, pelu);
        manolo.realizarEncuesta(primera, manuel, pelu);
        System.out.println(manuel.getCantidadEncuestas());
        manolo.getEncuentas();
    }
}