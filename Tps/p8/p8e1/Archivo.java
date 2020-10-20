package p8.p8e1;

import p8.p8e1.Criterios.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends ElementoSA {
    private LocalDate fechaModificacion;
    private double tamanio;

    public Archivo (String nombre, double tamanio) {
        super(nombre);
        this.fechaModificacion = LocalDate.now();
        this.tamanio = tamanio;
    }


    @Override
    public double getTamanio() {
        return this.tamanio;
    }

    public ArrayList<ElementoSA> buscar (Criterio criterio) {
        ArrayList<ElementoSA> retorno = new ArrayList<>();
        if (criterio.cumple(this))
            retorno.add(this);

        return retorno;
    }


}
