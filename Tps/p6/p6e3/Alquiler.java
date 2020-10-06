package p6e3;

import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private Producto producto;
    private LocalDate fechaVencimiento;

    public Alquiler (Cliente cliente, Producto producto, LocalDate fechaVencimiento) {
        this.cliente = cliente;
        this.producto = producto;
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estoyVencido () {
        return this.fechaVencimiento.compareTo(LocalDate.now()) < 0;
    }
    public Cliente getCliente () {
        return this.cliente;
    }
}
