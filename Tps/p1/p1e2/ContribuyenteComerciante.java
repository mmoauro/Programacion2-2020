package p1e2;

public class ContribuyenteComerciante extends ContribuyenteSimple {
    private final double porcentajeMontoFacturado = 2.5;
    private int dineroFacturado;


    public ContribuyenteComerciante (String nombre, int montoFijo, int dineroFacturado) {
        super(nombre, montoFijo);
        this.dineroFacturado = dineroFacturado;
    }

    public double getContribucion() {
        return super.getContribucion() / 2 + (porcentajeMontoFacturado * dineroFacturado) / 100;
    }
}
