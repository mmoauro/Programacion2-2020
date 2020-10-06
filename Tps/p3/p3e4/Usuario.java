package p3e4;
import java.util.ArrayList;
public class Usuario {
    String nombre;
    ArrayList<Episodio> episodiosVistos = new ArrayList<Episodio>();

    public Usuario (String nombre) {
        this.nombre = nombre;
    }
    public void agregarEpisodioVisto (Episodio episodio, int calificacion) {
        this.episodiosVistos.add(episodio);
        if (calificacion > 0 && calificacion <= 5) {
        episodio.setCalificacion(calificacion);
        }
        else {
            System.out.println("La calificacion no es valida.");
        }
        episodio.setYaSeVio();
    }

}
