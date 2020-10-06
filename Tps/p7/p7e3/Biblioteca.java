package p7.p7e3;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    private Ordenamiento metodoOrdenar;
    // metodo de ordenamiento.
    // recibe un array list de libros y los ordena.

    public Biblioteca (String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.metodoOrdenar = new OrdenamientoDefault();
    }

    public void cambiarMetodoOrdenamiento (Ordenamiento ordenamiento) {
        this.metodoOrdenar = ordenamiento;
        metodoOrdenar.ordenar(this.libros);
    }

    public void addLibro (Libro libro) {
        this.libros.add(libro);
        metodoOrdenar.ordenar(this.libros);
    }
    public void ordenarDescendente () {
        Collections.sort(this.libros, Collections.reverseOrder());
    }

    public ArrayList<Libro> getLibros() {
        return (ArrayList) this.libros.clone();
    }
}
