package p4e5;

import java.time.LocalDate;

public class ProductoFresco  extends Producto{

    public ProductoFresco (LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen) {
        super(fechaVencimiento, fechaEnvasado, numeroLote, granjaOrigen);
    }

}
