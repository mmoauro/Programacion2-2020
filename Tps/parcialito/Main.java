package parcialito;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("luna", 2014);
        pelicula.addActor("Manuel Moauro");
        pelicula.addGenero("Infantil");
        pelicula.setDirector("Pedro");
        pelicula.setDuracion(90);

        Plataforma plataforma = new Plataforma("Netflix");
        plataforma.addPelicula(pelicula);

        Criterio c1 = new CriterioTituloContiene("asdasd");
        Criterio c2 = new CriterioActor("Manuel Moauro");
        Criterio c3 = new CriterioGeneroContiene("Infantil");
        Criterio c4 = new CriterioContieneDirector("Rafael");
        Criterio c5 = new CriterioNot(c4);
        Criterio c6 = new CriterioAnd(c2, c5);
        Criterio c7 = new CriterioDuracionMenor(95);
        Criterio c8 = new CriterioSeGraboAntes(2015);
        Criterio c9 = new CriterioAnd(c7, c8);

        System.out.println(plataforma.getPeliculasPorBusqueda(c5));

        plataforma.setPeliculaRentable(c9);
        System.out.println(plataforma.peliculaEsRentable(pelicula));

        plataforma.setPeliculaRentable(c1);
        System.out.println(plataforma.peliculaEsRentable(pelicula));

        // Dejo algunas pruebas del funcionamiento.



    }
}
