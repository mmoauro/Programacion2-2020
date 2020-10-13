package parcialito;

public class CriterioGeneroContiene implements Criterio {
    private String genero;

    public CriterioGeneroContiene (String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getGeneros().contains(genero);
    }
}
