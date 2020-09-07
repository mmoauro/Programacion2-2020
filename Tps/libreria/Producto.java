package libreria;

public class Producto {
    private String nombre;
    private String autor;
    private double precio;
    private int cantidadHojas;

    public Producto (String nombre, String autor, double precio, int cantidadHojas) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantidadHojas = cantidadHojas;
    }

    public void setPrecio (double precio) {
        this.precio = precio;
    }
    public double getPrecio () {
        return this.precio;
    }
    public boolean equals (Object obj) {
        try {
            Producto nuevo = (Producto) obj;
            return this.nombre == nuevo.nombre && this.cantidadHojas == nuevo.cantidadHojas;
        }
        catch (Exception e) {
            return  false;
        }
    }
    public String getAutor () {
        return this.autor;
    }
}
