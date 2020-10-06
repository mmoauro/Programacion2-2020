package p6e1;

public class Candidato {
    private String nombreCompleto;
    private double sueldo;
    private  String empresa;
    private AceptaContrato acepta;

    public Candidato (String nombreCompleto, double sueldo, String empresa, AceptaContrato acepta) {
        this.nombreCompleto = nombreCompleto;
        this.sueldo = sueldo;
        this.empresa = empresa;
        this.acepta = acepta;
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

    public boolean puedoAceptarContrato() {
        return this.acepta.acepta(this);
    }
    public void cambiarAceptacion (AceptaContrato acepta) {
        this.acepta = acepta;
    }

}