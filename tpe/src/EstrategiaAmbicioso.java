import java.util.ArrayList;

public class EstrategiaAmbicioso implements Estrategia {

    @Override
    public int getAtributo(Carta c) {
        ArrayList<Atributo> atributos = c.getAtributos();
        int max = 0;
        double valor = 0;
        for (int i = 0; i < atributos.size(); i++) {
            if (atributos.get(i).getValor() > valor) {
                max = i;
                valor = atributos.get(i).getValor();
            }
        }
        return max;
    }
}
