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

    public ArrayList<Documento> getDocumentosPorBusqueda (Busqueda busqueda) {
        ArrayList<Documento> copia = new ArrayList<>();
        for (Documento documento:this.documentos) {
            if (busqueda.cumple(documento)) {
                copia.add(documento);
            }
        }
        return copia;
    }

}
