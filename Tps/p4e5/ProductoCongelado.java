package p4e5;

import java.time.LocalDate;

public class ProductoCongelado  extends PoroductoRefrigerado{

    public ProductoCongelado (LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen, int codigo, double temperatura) {
        super(fechaVencimiento, fechaEnvasado, numeroLote, granjaOrigen, codigo, temperatura);
    }
}
