public class CriterioCaracteristicaIgual implements Criterio {
    private Caracteristica c;

    public CriterioCaracteristicaIgual(Caracteristica c) {
        this.c = c;
    }

    @Override
    public boolean cumple(Automovil automovil) {
        return automovil.caracteristicaEsIgual(this.c);
    }
}
