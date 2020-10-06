package p7.p7e3;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenamientoDefault implements Ordenamiento {

    @Override
    public void ordenar(ArrayList<Libro> libros) {
        Collections.sort(libros);
    }
}
