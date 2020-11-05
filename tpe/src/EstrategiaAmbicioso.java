import java.util.ArrayList;

public class EstrategiaAmbicioso implements Estrategia {

    @Override
    public String getAtributo(Carta c) {
        ArrayList<Atributo> atributos = c.getAtributos();
        String nombre = "";
        double valor = 0;
        for (int i = 0; i < atributos.size(); i++) {
            Atributo a = atributos.get(i);
            if (a.getValor() > valor) {
                nombre = a.getNombre();
                valor = atributos.get(i).getValor();
            }
        }
        return nombre;
    }
}
