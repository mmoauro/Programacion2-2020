package p6e3;

public class Auto extends Producto {
    private String marca;
    private int kms;
    private String patente;

    public Auto (String marca, int kms, String patente) {
        super();
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
    }

    public void addKms (int kms) {
        this.kms += kms;
    }

    @Override
    public boolean mePuedenAlquilar() {
        return !this.getEstoyAlquilado();
    }
}
