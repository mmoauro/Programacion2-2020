package parcialito;

public class CriterioNot implements Criterio{
    private Criterio c1;
    public CriterioNot (Criterio c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return !c1.cumple(pelicula);
    }
}
