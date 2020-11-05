public class CriterioAnd implements Criterio {
    private Criterio c1;
    private Criterio c2;

    public CriterioAnd (Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Automovil automovil) {
        return this.c1.cumple(automovil) && this.c2.cumple(automovil);
    }
}
