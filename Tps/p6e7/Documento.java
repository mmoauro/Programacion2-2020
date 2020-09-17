package p6e7;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contenido;
    private ArrayList<String> palabrasClave;

    public Documento(String titulo, ArrayList<String> autores, String contenido, ArrayList<String> palabrasClave) {
        this.titulo = titulo;
        this.autores = autores;
        this.contenido = contenido;
        this.palabrasClave = palabrasClave;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public String getContenido() {
        return contenido;
    }

    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }
}
