package p4e5;

import java.time.LocalDate;

public class PoroductoRefrigeradoOCongelado extends Producto {
    private int codigoOrganismo;
    private double temperaturaMantenimiento;

    public PoroductoRefrigeradoOCongelado(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen, int codigoOrganismo, double temperaturaMantenimiento) {
        super(fechaVencimiento, fechaEnvasado, numeroLote, granjaOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }
}
