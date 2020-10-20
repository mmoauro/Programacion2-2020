package p8.p8e1;

import p8.p8e1.Criterios.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSA {
    private String nombre;
    private LocalDate fechaCreacion;


    public ElementoSA (String nombre) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
    }

    public String getNombre () {
        return this.nombre;
    }
    public LocalDate getFechaCreacion () {
        return this.fechaCreacion;
    }
    public abstract double getTamanio();
    public abstract ArrayList<ElementoSA> buscar (Criterio criterio);
}
