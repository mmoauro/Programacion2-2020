public class CriterioNot implements Criterio {
    private Criterio c;

    public CriterioNot (Criterio c) {
        this.c = c;
    }

    @Override
    public boolean cumple(Automovil automovil) {
        return !this.c.cumple(automovil);
    }
}
