package p6e1;

public abstract class Candidato {
    private String nombreCompleto;
    private double sueldo;
    private  String empresa;

    public Candidato (String nombreCompleto, double sueldo, String empresa) {
        this.nombreCompleto = nombreCompleto;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public abstract boolean puedoAceptarContrato(Contrato contrato);

}