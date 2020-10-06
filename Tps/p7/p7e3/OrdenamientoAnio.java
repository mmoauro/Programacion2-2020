package p7.p7e3;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenamientoAnio implements Ordenamiento {

    @Override
    public void ordenar(ArrayList<Libro> libros) {
        for (Libro libro:libros) {
            libro.setComparador(libro.getAnio());
        }
        Collections.sort(libros);
    }
}
