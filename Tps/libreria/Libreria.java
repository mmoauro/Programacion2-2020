package libreria;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Producto> productos;

    public Libreria () {
    }
    public void addProducto (Producto producto) {
        this.productos.add(producto);
    }
    public double getPrecioProductoParaCliente (Producto producto, Cliente cliente) {
        return producto.getPrecio() - (producto.getPrecio() * cliente.getDescuento() / 100);
    }
    public boolean clienteYaComproProducto (Producto producto, Cliente cliente) {
        return cliente.comproProducto(producto);
    }
}
