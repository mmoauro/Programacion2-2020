package p4e5;

import java.time.LocalDate;

public class ProductoCongeladoAire extends PoroductoRefrigeradoOCongelado {
    private int porcentajeNitrogeno;
    private int porcentajeOxigeno;
    private int porcentajeCo2;
    private int porcentajeVaporAgua;

    public ProductoCongeladoAire (LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen, int codigo, double temperatura, int porcentajeNitrogeno, int porcentajeOxigeno, int porcentajeCo2, int porcentajeVaporAgua) {
        super(fechaVencimiento, fechaEnvasado, numeroLote, granjaOrigen, codigo, temperatura);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeCo2 = porcentajeCo2;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public int getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }

    public int getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }

    public int getPorcentajeCo2() {
        return porcentajeCo2;
    }

    public int getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }
}
