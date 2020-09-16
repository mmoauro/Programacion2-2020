package p6e1;

public class Contrato {
    private int horasSemanales;
    private double sueldo;
    private String empresa;

    public Contrato (int horas, double sueldo, String empresa) {
        this.horasSemanales = horas;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getEmpresa() {
        return empresa;
    }
}
