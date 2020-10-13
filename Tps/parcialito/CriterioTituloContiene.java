package parcialito;

public class CriterioTituloContiene implements Criterio {
    private String palabra;

    public CriterioTituloContiene(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getTitulo().contains(this.palabra);
    }
}
