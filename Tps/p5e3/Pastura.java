package p5e3;

public class Pastura extends Cereal{
    private final int hectareasMinimas = 50;

    public Pastura (String nombre) {
        super(nombre);
    }

    public boolean mePuedenSembrar(Lote lote) {
        return super.mePuedenSembrar(lote) && lote.getHectareas() >= this.hectareasMinimas;
    }
}
