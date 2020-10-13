package parcialito;

public class CriterioDuracionMenor implements Criterio {
    private int duracion;

    public CriterioDuracionMenor (int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getDuracion() < this.duracion;
    }
}
