public class EstrategiaObstinado implements Estrategia {
    private String nombreAtr;

    public EstrategiaObstinado (String nombreAtr) {
        this.nombreAtr = nombreAtr;
    }

    @Override
    public int getAtributo(Carta c) {
        Atributo a = new Atributo(nombreAtr, 0);
        for (int i = 0; i < c.getAtributos().size(); i++) {
            if (c.getAtributos().get(i).equals(a))
                return i;
        }
        Estrategia aux = new EstrategiaTimbero();
        return aux.getAtributo(c); // Si elige un atributo que no existe devuelvo un atributo random.
    }
}
