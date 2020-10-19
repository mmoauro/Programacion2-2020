package p8e1;

import p8e1.Criterios.Criterio;

import java.util.ArrayList;

public class Carpeta extends ElementoSA {
    private ArrayList<ElementoSA> elementos;

    public Carpeta (String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento (ElementoSA elem) {
        this.elementos.add(elem);
        // Se podria hacer para que no agregue repetidos.
    }

    @Override
    public double getTamanio() {
        int total = 0;
        for (ElementoSA elem:this.elementos) {
            total+=elem.getTamanio();
        }
        return total;
    }

    public ArrayList<ElementoSA> buscar (Criterio criterio) {
        ArrayList<ElementoSA> retorno = new ArrayList<>();
        if (criterio.cumple(this))
            retorno.add(this);

        for (ElementoSA elem:this.elementos) {
            retorno.addAll(elem.buscar(criterio));
        }
        return retorno;
    }
}
