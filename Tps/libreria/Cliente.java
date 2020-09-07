package libreria;

import java.util.ArrayList;

public class Cliente {
    private String nombreCompleto;
    private  String dni;
    private String direccion;
    private ArrayList<String> autoresFavoritos;
    private ArrayList<String> generosQueLeGusta;
    private ArrayList<Producto> compras;
    private ArrayList<Producto> productosQueLeGustan;
    private int descuento;


    public Cliente(String nombreCompleto, String dni, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.direccion = direccion;
        this.descuento = 0;
    }
    public void setDescuento (int descuento) {
        this.descuento = descuento;
    }
    public int getDescuento () {
        return this.descuento;
    }
    public boolean comproProducto (Producto producto) {
        return this.compras.contains(producto);
    }
    public boolean leGustaElAutor (String autor) {
        return this.autoresFavoritos.contains(autor);
    }
    public boolean leGustaLibro (Libro libro) {
        return this.productosQueLeGustan.contains(libro);
    }
    public boolean leGustaGenero (String genero) {
        return this.generosQueLeGusta.contains(genero);
    }
}
