package p6e3;

import java.util.ArrayList;

public class Cliente {
    private String dni;
    private ArrayList<Producto> productosAlquilados; //Son los productos que tiene alquilados actualmente.

    public Cliente (String dni) {
        this.dni = dni;
    }
    public void addProducto (Producto producto) {
        this.productosAlquilados.add(producto);
    }
}
