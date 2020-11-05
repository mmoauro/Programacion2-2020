public class EstrategiaObstinado implements Estrategia {
    private String nombreAtr;

    public EstrategiaObstinado (String nombreAtr) {
        this.nombreAtr = nombreAtr;
    }

    @Override
    public String getAtributo(Carta c) {
        for (int i = 0; i < c.getAtributos().size(); i++) {
            if (c.getAtributos().get(i).getNombre().equals(this.nombreAtr))
                return c.getAtributos().get(i).getNombre();
        }
        Estrategia aux = new EstrategiaTimbero();
        return aux.getAtributo(c); // Si elige un atributo que no existe devuelvo un atributo random.
    }
}
