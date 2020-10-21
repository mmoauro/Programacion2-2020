package p8.p8e4;

import java.util.ArrayList;

public class SitioNoticias {
    private String nombre;
    private ArrayList<CategoriaOSeccion> secciones;

    public SitioNoticias (String nombre) {
        this.nombre = nombre;
        this.secciones = new ArrayList<>();
    }


}
