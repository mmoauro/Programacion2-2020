package p4e5;

import java.time.LocalDate;

public class ProductoCongeladoAgua extends PoroductoRefrigeradoOCongelado {
    private  double salinidadAgua; //En gramos por litro de agua

    public ProductoCongeladoAgua (LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen, int codigo, double temperatura, double salinidadAgua) {
        super(fechaVencimiento, fechaEnvasado, numeroLote, granjaOrigen, codigo, temperatura);
        this.salinidadAgua = salinidadAgua;
    }

    public double getSalinidadAgua() {
        return salinidadAgua;
    }
}
