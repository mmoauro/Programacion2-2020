import java.util.ArrayList;

public class EstrategiaTimbero implements Estrategia {

    @Override
    public String getAtributo(Carta c) {
        ArrayList<Atributo> atributos = c.getAtributos();
        int random = (int) (Math.random()*atributos.size());
        return atributos.get(random).getNombre();
    }
}
