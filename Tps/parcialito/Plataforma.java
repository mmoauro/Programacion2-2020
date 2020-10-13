package parcialito;

import java.util.ArrayList;

public class Plataforma {

    private String nombre;
    private ArrayList<Pelicula> peliculas;
    private Criterio peliculaRentable;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.peliculas = new ArrayList<>();
    }
    public void addPelicula (Pelicula pelicula) {
        if (!this.peliculas.contains(pelicula)) // Hago esta verificacion para no tener peliculas duplicadas.
            this.peliculas.add(pelicula);
    }

    public ArrayList<Pelicula> getPeliculasPorBusqueda (Criterio criterio) {
        // No lo hice, pero se podria hacer que cuando haya que buscar por String, pasarlos a uppercase o lowercase para mejorar las busquedas.
        ArrayList<Pelicula> retorno = new ArrayList<>();
        for (Pelicula pel: this.peliculas) {
            if (criterio.cumple(pel))
                retorno.add(pel);
        }
        return retorno;
    }

    public void setPeliculaRentable (Criterio criterio) {
        this.peliculaRentable = criterio;
    }

    public boolean peliculaEsRentable (Pelicula pelicula) {
        if (this.peliculaRentable != null)
            return this.peliculaRentable.cumple(pelicula);
        System.out.println("No hay criterio");
        return false;
    }
}
