package p8.p8e5;

import p8.p8e5.Criterio.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class GastoAbs {
    private ArrayList<Caracteristica> caracteristicas;

    public GastoAbs (String descripcion) {
        this.caracteristicas = new ArrayList<>();
        this.caracteristicas.add(new Caracteristica("Descripcion", descripcion));
        this.caracteristicas.add(new Caracteristica("Fecha", LocalDate.now()));
    }

    public abstract double getMonto ();
    public abstract ArrayList<GastoAbs> buscar (Criterio criterio);
    public boolean contieneCaracteristica (Caracteristica caracteristica) {
        return this.caracteristicas.contains(caracteristica);
    }

    public ArrayList<Caracteristica> getCaracteristicas () {
        return (ArrayList) this.caracteristicas.clone();
    }

    public Caracteristica getCaracteristica (String nombre) {
        for (Caracteristica c: this.caracteristicas) {
            if (c.getNombre().equals(nombre))
                return c;
        }
        return null;
    }

    public void addCaracteristica (String nombre, Comparable valor) {
        this.caracteristicas.add(new Caracteristica(nombre, valor));
    }

    public abstract String getDetalle();
}
