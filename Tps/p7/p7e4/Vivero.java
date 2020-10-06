package p7.p7e4;

import java.util.ArrayList;
import java.util.Collections;

public class Vivero {
    private ArrayList<Planta> plantas;

    public Vivero () {
        this.plantas = new ArrayList<>();
    }
    public void addPlanta (Planta planta) {
        this.plantas.add(planta);
    }

    public ArrayList<Planta> getPlantas (Criterio criterio, String comparador, int ordenamiento) {
        // ordenamiento > 0 ascendente, ordenamiento < 0 descendente
        ArrayList<Planta> retorno = new ArrayList<>();
        for (Planta planta:this.plantas) {
            if (criterio.cumple(planta))
                retorno.add(planta);
        }
        Planta.setComparador(comparador);
        if (ordenamiento > 0)
            Collections.sort(retorno);
        else
            Collections.sort(retorno, Collections.reverseOrder());


        return retorno;
    }

}
