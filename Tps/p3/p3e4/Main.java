package p3e4;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Usuario manuel = new Usuario("Manuel");
        Episodio primero = new Episodio("Assd", "dqwdqwqw");
        Episodio segundo = new Episodio("erger", "Fwefew");
        ArrayList<Episodio> episodios = new ArrayList<Episodio>();
        episodios.add(primero);
        episodios.add(segundo);
        Temporada primera = new Temporada("sadas", "dasdas", episodios);
        Serie moauro = new Serie("dwqdqw", "fdew", "fdqwe", "few");
        moauro.agregarTemporada(primera);
        manuel.agregarEpisodioVisto(primero, 5);
        manuel.agregarEpisodioVisto(segundo, 2);
        System.out.println(moauro.getTotalEpisodiosVistos());
        System.out.println(moauro.getCalificacionPromedio());
        System.out.println(moauro.seVieronTodosLosEpisodios());
    }
}