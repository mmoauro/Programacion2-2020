package p1e2;

public class ContribuyenteProgramador extends ContribuyenteSimple {
    private final double porcentajeMontoFacturado = 2;
    private int dineroFacturado;


    public ContribuyenteProgramador(String nombre, int montoFijo, int dineroFacturado) {
        super(nombre, montoFijo);
        this.dineroFacturado = dineroFacturado;
    }

    public double getContribucion() {
        return 20 * super.getContribucion() / 100 + (porcentajeMontoFacturado * dineroFacturado) / 100;
    }
}
