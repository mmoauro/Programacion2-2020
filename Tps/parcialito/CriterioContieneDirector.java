package parcialito;

public class CriterioContieneDirector implements Criterio {
    private String director;

    public CriterioContieneDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.tieneDirector(this.director);
    }
}
