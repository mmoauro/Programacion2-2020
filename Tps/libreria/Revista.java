package libreria;

public class Revista extends Producto {
    private int anio; //Considero anio como el anio que fue escrita la revista

    public Revista (String nombre, String autor, double precio, int cantidadHojas, int anio) {
        super(nombre, autor, precio, cantidadHojas);
        this.anio = anio;
    }
    public int getAnio () {
        return this.anio;
    }

}
