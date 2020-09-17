package p6e7;

import java.util.ArrayList;

public class Historiador {
    private ArrayList<Documento> documentos;

    public Historiador () {
        this.documentos = new ArrayList<>();
    }

    public void addDocumento (Documento documento) {
        this.documentos.add(documento);
    }

    public ArrayList<Documento> getDocumentosPorTitulo (String titulo) {
        ArrayList<Documento> copia = new ArrayList<>();
        for (Documento documento:this.documentos) {
            if (documento.getTitulo() == titulo) {
                copia.add(documento);
            }
        }
        return copia;
    }

    public ArrayList<Documento> getDocumentosPalabraEnTitulo (String palabra) {
        ArrayList<Documento> copia = new ArrayList<>();
        for (Documento documento:this.documentos) {
            if (documento.getTitulo().contains(palabra)) {
                copia.add(documento);
            }
        }
        return copia;
    }

    public ArrayList<Documento> getDocumentosPorPalabraClave (String palabra) {
        ArrayList<Documento> copia = new ArrayList<>();
        for (Documento documento:this.documentos) {
            if (documento.getPalabrasClave().contains(palabra)) {
                copia.add(documento);
            }
        }
        return copia;
    }

    public ArrayList<Documento> getDocumentosSiNoContienePalabraClave (String palabra) {
        ArrayList<Documento> copia = new ArrayList<>();
        for (Documento documento:this.documentos) {
            if (!documento.getPalabrasClave().contains(palabra)) {
                copia.add(documento);
            }
        }
        return copia;
    }

    public ArrayList<Documento> getDocumentosPorAutor (String autor) {
        ArrayList<Documento> copia = new ArrayList<>();
        for (Documento documento:this.documentos) {
            if (documento.getAutores().contains(autor)) {
                copia.add(documento);
            }
        }
        return copia;
    }

    public ArrayList<Documento> getDocumentosPorContenido (String palabra) {
        ArrayList<Documento> copia = new ArrayList<>();
        for (Documento documento:this.documentos) {
            if (documento.getContenido().contains(palabra)) {
                copia.add(documento);
            }
        }
        return copia;
    }

    public ArrayList<Documento> getDocumentosCOntenidoMayor20 () {
        ArrayList<Documento> copia = new ArrayList<>();
        for (Documento documento:this.documentos) {
            if (documento.getContenido().length() > 20) {
                copia.add(documento);
            }
        }
        return copia;
    }




}
