package libreria;

public class Libro extends Producto {

    private String resumen;
    private String genero;

    public Libro (String nombre, String autor, double precio, int cantidadHojas, String resumen, String genero) {
        super(nombre, autor, precio, cantidadHojas);
        this.resumen = resumen;
        this.genero = genero;
    }
    public String getGenero () {
        return this.genero;
    }
}
