package p6e3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Videoclub {
    ArrayList<Cliente> clientes;
    ArrayList<Producto> productos;
    ArrayList<Alquiler> alquilersActuales;

    public Videoclub () {
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.alquilersActuales = new ArrayList<>();
    }
    public void alquilar (Cliente cliente, Producto producto, LocalDate fecha) {
        if (producto.mePuedenAlquilar()) {
            alquilersActuales.add(new Alquiler(cliente, producto, fecha));
            cliente.addProducto(producto);
        }
    }
    public ArrayList<Cliente> getClientesConAlquileresVencidos () {
        ArrayList<Cliente> clientes = new ArrayList<>();
        for (Alquiler alquiler:this.alquilersActuales) {
            if (alquiler.estoyVencido()) {
                clientes.add(alquiler.getCliente());
            }
        }
        return clientes;
    }
}
