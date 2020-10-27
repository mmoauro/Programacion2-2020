package p8.p8e4;

import p8.p8e4.Criterios.Criterio;

import java.util.ArrayList;

public abstract class ElementoSitio {
    private String nombre;
    private CategoriaOSeccion padre;

    public ElementoSitio (String nombre) {
        this.nombre = nombre;
    }

    public void setPadre (CategoriaOSeccion padre) {
        this.padre = padre;
    }

    public ElementoSitio getPadre () {
        return this.padre;
    }

    public String getNombre () {
        return this.nombre;
    }

    public abstract int getCantidadNoticias ();

    public abstract String getUbicacion ();

    public abstract ArrayList<ElementoSitio> getNoticiasCriterio (Criterio criterio);

}
