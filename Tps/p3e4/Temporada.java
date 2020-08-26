package p3e4;
import java.util.ArrayList;
public class Temporada {
    private String nombre;
    private String descripcion;
    private ArrayList<Episodio> episodios = new ArrayList<Episodio>();

    public Temporada (String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Temporada (String nombre, String descripcion, ArrayList<Episodio> episodios) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.episodios = episodios;
    }
    public void agregarEpisodio (Episodio episodio) {
        this.episodios.add(episodio);
    }
    public String getEpisodiosVistos () {
        String s = "";
        for (Episodio episodio: episodios) {
            if (episodio.yaSeVio()) {
                s+= episodio.getTitulo() + " - ";
            }
        }
        return s;
    }
    public int getTotalEpisodiosVistos () {
        int i = 0;
        for (Episodio episodio: this.episodios) {
            if (episodio.yaSeVio()) {
                i++;
            }
        }
        return i;
    }
    public int getCalificacionPromedio () {
        int i = 0;
        int episodioVistos = 0;
        for (Episodio episodio: this.episodios) {
            if (episodio.yaSeVio()) {
                i += episodio.getCalificacion();
                episodioVistos++;
            }
        }
        return i / episodioVistos;
    }
    public boolean seVieronTodosLosEpisodios () {
        int i = 0;
        for (Episodio episodio: this.episodios) {
            if (episodio.yaSeVio()) {
                i++;
            }
        }
        return i == this.episodios.size();
    }

}
