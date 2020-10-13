package parcialito;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinapsis;
    private ArrayList<String> generos;
    private String director; // Interpreto que solo tiene un director. Si tiene mas lo haria con un array list.
    private ArrayList<String> actores;
    private int anioEstreno;
    private int edadMinima;
    private int duracion; // en minutos

    public Pelicula (String titulo, int anioEstreno) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.generos = new ArrayList<>();
        this.actores = new ArrayList<>();
    }

    public void setSinapsis(String sinapsis) {
        this.sinapsis = sinapsis;
    }

    public void addGenero(String genero) {
        if (!this.generos.contains(genero))
            this.generos.add(genero);
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void addActor(String actor) {
        if (!this.actores.contains(actor))
            this.actores.add(actor);
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo () {
        return this.titulo;
    }

    public ArrayList<String> getGeneros () {
        return (ArrayList) this.generos.clone();
    }

    public ArrayList<String> getActores (){
        return (ArrayList) this.actores.clone();
    }

    public String getDirector () {
        return this.director;
    }

    public int getAnioEstreno () {
        return this.anioEstreno;
    }

    public int getDuracion () {
        return this.duracion;
    }

    public boolean equals (Object o) {
        try {
            Pelicula nueva = (Pelicula) o;
            return this.getTitulo().equals(nueva.getTitulo());
        }
        catch (Exception e) {
            return false;
        }
    }
    public boolean tieneActor (String actor) {
        return this.actores.contains(actor);
    }

    public boolean tieneDirector (String director) {
        return this.director.equals(director);
    }

    public String toString () {
        return this.titulo;
    }

}
