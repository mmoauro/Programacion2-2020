package parcialito;

public class CriterioSeGraboAntes implements Criterio {
    private int anio;

    public CriterioSeGraboAntes(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getAnioEstreno() < this.anio;
    }
}
