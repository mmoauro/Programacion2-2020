import java.util.ArrayList;

public class Estacionamiento implements ElementoSistemaCochera {
    private ArrayList<Cochera> cocheras;

    public Estacionamiento () {
        this.cocheras = new ArrayList<>();
    }

    public void addCochera (Cochera c) {
        if (!this.cocheras.contains(c)) {
            // No aniado cocheras repetidas.
            this.cocheras.add(c);
        }
    }

    @Override
    public int getCantiadCocheras() {
        int total = 0;
        for (Cochera c:this.cocheras) {
            total += c.getCantiadCocheras();
        }
        return total;
    }

    @Override
    public ArrayList<Cochera> getCocherasDisponiblesParaAutomovil(Automovil automovil) {
        ArrayList<Cochera> retorno = new ArrayList<>();
        for (Cochera c:this.cocheras) {
            retorno.addAll(c.getCocherasDisponiblesParaAutomovil(automovil));
        }
        return retorno;
    }

    @Override
    public ElementoSistemaCochera getCopia(Criterio c) {
        ArrayList<ElementoSistemaCochera> copiaCocheras = new ArrayList<>();
        for (Cochera cochera:this.cocheras) {
            ElementoSistemaCochera copia = cochera.getCopia(c);
            if (copia != null) {
                copiaCocheras.add(copia);
            }
        }
        if (copiaCocheras.size() > 0) {
            // Si hay aluna cochera que cumple
            Estacionamiento retorno = new Estacionamiento();
            for (ElementoSistemaCochera coc:copiaCocheras) {
                retorno.addCochera((Cochera) coc);
            }
            return retorno;
        }
        return null;
    }
}
