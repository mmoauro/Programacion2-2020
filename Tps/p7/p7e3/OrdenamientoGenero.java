package p7.p7e3;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenamientoGenero implements Ordenamiento {


    @Override
    public void ordenar(ArrayList<Libro> libros) {
        for (Libro libro:libros) {
            libro.setComparador(libro.getGeneroPincipal());
        }
        Collections.sort(libros);
    }
}
