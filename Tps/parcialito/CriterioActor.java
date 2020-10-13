package parcialito;

public class CriterioActor implements Criterio {
    private String actor;

    public CriterioActor(String actor) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.tieneActor(this.actor);
    }
}
