public class EstrategiaObstinado implements Estrategia {
    private int posAtr;

    public EstrategiaObstinado (int posAtr) {
        this.posAtr = posAtr;
    }

    @Override
    public int getAtributo(Carta c) {
        return this.posAtr;
    }
}
