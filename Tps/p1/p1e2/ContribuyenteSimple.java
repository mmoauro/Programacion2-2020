package p1e2;

public class ContribuyenteSimple {
    private String nombre;
    private static int codigoTributario = 0;
    private int codigo;
    private int montoFijo;

    public ContribuyenteSimple (String nombre, int montoFijo) {
        this.nombre = nombre;
        this.montoFijo = montoFijo;
        ContribuyenteSimple.aumentarCodigoTributario();
        this.codigo = ContribuyenteSimple.getCodigoTributario();
    }

    public static void aumentarCodigoTributario () {
        ContribuyenteSimple.codigoTributario++;
    }
    public static int getCodigoTributario() {
        return ContribuyenteSimple.codigoTributario;
    }

    public double getContribucion () {
        return montoFijo;
    }

}
