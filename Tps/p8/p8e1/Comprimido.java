package p8.p8e1;

import p8.p8e1.Criterios.Criterio;

import java.util.ArrayList;

public class Comprimido extends Carpeta {
    private double factorCompresion; // lo tomo como valor del 0 al 1.

    public Comprimido (String nombre, double factorCompresion) {
        super(nombre);
        this.factorCompresion = factorCompresion;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio() * factorCompresion;
    }

    @Override
    public ArrayList<ElementoSA> buscar(Criterio criterio) {
        ArrayList<ElementoSA> retorno = new ArrayList<>();
        if (super.buscar(criterio).size() > 0)
            retorno.add(this);
        return retorno;
    }
}
