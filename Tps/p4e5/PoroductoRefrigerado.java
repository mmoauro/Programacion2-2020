package p4e5;

import java.time.LocalDate;

public class PoroductoRefrigerado extends Producto {
    private int codigoOrganismo;
    private double temperaturaMantenimiento;

    public PoroductoRefrigerado(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen, int codigoOrganismo, double temperaturaMantenimiento) {
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
