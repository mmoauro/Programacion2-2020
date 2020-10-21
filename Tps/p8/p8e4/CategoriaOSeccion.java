package p8.p8e4;

import java.util.ArrayList;

public class CategoriaOSeccion {
    private String descripcion;
    private String img;
    private ArrayList<CategoriaOSeccion> hijos;
    private ArrayList<Noticia> noticias;

    public CategoriaOSeccion (String descripcion, String img) {
        this.descripcion = descripcion;
        this.img = img;
        this.hijos = new ArrayList<>();
        this.noticias = new ArrayList<>();
    }
}
