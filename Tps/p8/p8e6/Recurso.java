package p8.p8e6;

public class Recurso {
    private String nombre;
    private boolean enUso;
    private boolean exclusivo;

    public Recurso (String nombre, boolean exclusivo) {
        this.nombre = nombre;
        this.enUso = false;
        this.exclusivo = exclusivo;
    }

    public void setEnUso () {
        this.enUso = true;
    }

    public void setLibre () {
        this.enUso = false;
    }

    public boolean getEnUso () {
        return this.enUso;
    }

    public boolean esExclusivo () {
        return this.exclusivo;
    }

    public boolean mePuedenUsar () {
        return !this.enUso && !this.exclusivo;
    }
}
