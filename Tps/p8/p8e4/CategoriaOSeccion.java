package p8.p8e4;

import p8.p8e4.Criterios.Criterio;

import java.util.ArrayList;

public class CategoriaOSeccion extends ElementoSitio {
    private String descripcion;
    private String img;
    private ArrayList<ElementoSitio> elementos;

    public CategoriaOSeccion (String nombre, String descripcion, String img) {
        super(nombre);
        this.descripcion = descripcion;
        this.img = img;
        this.elementos = new ArrayList<>();
    }

    public void addElemento (ElementoSitio elem) {
        this.elementos.add(elem);
        elem.setPadre(this);
    }

    @Override
    public int getCantidadNoticias() {
        int total = 0;
        for (ElementoSitio elem:this.elementos)
            total += elem.getCantidadNoticias();
        return total;
    }

    @Override
    public String getUbicacion() {
        if (this.getPadre() != null)
            return this.getPadre().getUbicacion() + this.getNombre() + '/';
        return this.getNombre() + '/';
    }

    @Override
    public ArrayList<ElementoSitio> getNoticiasCriterio(Criterio criterio) {
        ArrayList<ElementoSitio> retorno = new ArrayList<>();
        for (ElementoSitio elem: this.elementos)
            retorno.addAll(elem.getNoticiasCriterio(criterio));
        return retorno;
    }
}
