package p8.p8e4;

import java.util.ArrayList;

public class Noticia {
    private String titulo;
    private ArrayList<String> palabrasClave;
    private String texto;
    private String link;
    private String autor;

    public Noticia (String titulo, String texto, String autor) {
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.palabrasClave = new ArrayList<>();
    }

    public void addPalabraClave (String palabra) {
        this.palabrasClave.add(palabra);
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getPalabrasClave() {
        return (ArrayList) this.palabrasClave.clone();
    }

    public String getTexto() {
        return texto;
    }

    public String getLink() {
        return link;
    }

    public String getAutor() {
        return autor;
    }
}
