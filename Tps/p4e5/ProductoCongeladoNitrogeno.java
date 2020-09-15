package p4e5;

import java.time.LocalDate;

public class ProductoCongeladoNitrogeno extends PoroductoRefrigeradoOCongelado {
    private String informacionMetodoCongelacion;
    private double tiempoExposicionNitrogeno; // En segundos

    public ProductoCongeladoNitrogeno(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen, int codigo, double temperatura, String informacionMetodoCongelacion, double tiempoExposicionNitrogeno) {
        super(fechaVencimiento, fechaEnvasado, numeroLote, granjaOrigen,codigo, temperatura);
        this.informacionMetodoCongelacion = informacionMetodoCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    public String getInformacionMetodoCongelacion() {
        return informacionMetodoCongelacion;
    }

    public double getTiempoExposicionNitrogeno() {
        return tiempoExposicionNitrogeno;
    }
}
