package p8.p8e4;

import p8.p8e4.Criterios.Criterio;

import java.util.ArrayList;

public class Noticia extends ElementoSitio {
    private ArrayList<String> palabrasClave;
    private String introduccion;
    private String texto;
    private String autor;
    private String link;

    public Noticia (String nombre, String introduccion, String texto, String autor, String link) {
        super(nombre);
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.palabrasClave = new ArrayList<>();
    }

    @Override
    public int getCantidadNoticias() {
        return 1;
    }

    @Override
    public String getUbicacion() {
        return this.getPadre().getUbicacion() + this.link;
    }

    @Override
    public ArrayList<ElementoSitio> getNoticiasCriterio(Criterio criterio) {
        ArrayList<ElementoSitio> retorno = new ArrayList<>();
        if (criterio.cumple(this))
            retorno.add(this);
        return retorno;
    }

    public String toString () {
        return this.getNombre();
    }

    public String getAutor () {
        return this.autor;
    }

    public boolean tienePalabraClave (String palabra) {
        return this.palabrasClave.contains(palabra);
    }

    public int getLargoTexto () {
        return this.texto.length();
    }

}
