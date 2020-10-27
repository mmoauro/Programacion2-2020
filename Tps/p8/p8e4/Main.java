package p8.p8e4;

import p8.p8e4.Criterios.CriterioTituloIgual;

public class Main {
    public static void main(String[] args) {
        ElementoSitio noticia = new Noticia("Nombre", "sdffewfwe", "qwer23213423", "Manuel", "morron.com");
        CategoriaOSeccion categoria = new CategoriaOSeccion("Morronsito", "Asdasdas", "ASfefew");
        categoria.addElemento(noticia);
        SitioNoticias sitio = new SitioNoticias();
        CategoriaOSeccion otra = new CategoriaOSeccion("Otra", "asdasdas", "asdasdas");
        otra.addElemento(categoria);
        sitio.addElemento(otra);
        ElementoSitio o = new Noticia("Otra nueva", "fwefwe", "fwefew", "Fefew", "Das");
        categoria.addElemento(o);
        System.out.println(o.getUbicacion());
        CriterioTituloIgual criterio = new CriterioTituloIgual("Nombre");
        System.out.println(sitio.getNoticiasCriterio(criterio));
    }
}
