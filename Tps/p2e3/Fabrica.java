package p2e3;
import java.util.ArrayList;
public class Fabrica {
    private  ArrayList<Manufactura> productos = new ArrayList<Manufactura>();

    public Fabrica () {

    }
    public void setProducto (Manufactura producto) {
        this.productos.add(producto);
    }
    public int precioTotalProductosEnStock () {
        int precio = 0;
        for (Manufactura manufactura : productos) {
            if (manufactura.getStock()) {
                precio += manufactura.getValorVenta();
            }
        }
        return precio;
    }
}