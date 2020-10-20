public class EstrategiaTimbero implements Estrategia {

    @Override
    public int getAtributo(Carta c) {
        return (int) (Math.random()*c.getAtributos().size());
    }
}
