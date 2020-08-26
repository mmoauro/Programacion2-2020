package p3e4;
import java.util.ArrayList;
public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas = new ArrayList<Temporada>();

    public Serie (String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
    }
    public Serie (String titulo, String descripcion, String creador, String genero, ArrayList<Temporada> temporadas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = temporadas;
    }
    public void agregarTemporada (Temporada temporada) {
        this.temporadas.add(temporada);
    }
    public int getTotalEpisodiosVistos () {
        int i = 0;
        for (Temporada temporada: this.temporadas) {
            i+=temporada.getTotalEpisodiosVistos();
        }
        return i;
    }
    public int getCalificacionPromedio () {
        int i = 0;
        for (Temporada temporada: this.temporadas) {
            i += temporada.getCalificacionPromedio();
        }
        return i / this.temporadas.size();
    }
    public boolean seVieronTodosLosEpisodios () {
        int i = 0;
        for (Temporada temporada: this.temporadas) {
            if (temporada.seVieronTodosLosEpisodios()) {
                i++;
            }
        }
        return i == this.temporadas.size();
    }

}
