package p7.p7e4;

public class CriterioOr implements Criterio {
    private CriterioIgual c1;
    private CriterioIgual c2;

    public CriterioOr(CriterioIgual c1, CriterioIgual c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Planta planta) {
        return c1.cumple(planta) || c2.cumple(planta);
    }
}
