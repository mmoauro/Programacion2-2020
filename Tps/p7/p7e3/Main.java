package p7.p7e3;

public class Main {
    public static void main(String[] args) {
        Biblioteca primera = new Biblioteca("asd");
        Libro a = new Libro("afwefesd", "sad", 12,"wqe");
        Libro b = new Libro("zzzzzzz", "abc", 54,"aaaaqe");
        primera.addLibro(b);
        primera.addLibro(a);
        System.out.println(primera.getLibros());
        primera.cambiarMetodoOrdenamiento(new OrdenamientoAutor());
        System.out.println(primera.getLibros());
        primera.cambiarMetodoOrdenamiento(new OrdenamientoAnio());
        System.out.println(primera.getLibros());
        primera.cambiarMetodoOrdenamiento(new OrdenamientoGenero());
        primera.ordenarDescendente();
        System.out.println(primera.getLibros());
    }
}
