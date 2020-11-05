public class CriterioCaracteristicaMayor implements Criterio {
    private Caracteristica c;

    public CriterioCaracteristicaMayor(Caracteristica c) {
        this.c = c;
    }

    @Override
    public boolean cumple(Automovil automovil) {
        return automovil.caracteristicaEsMayor(this.c);
    }
}
