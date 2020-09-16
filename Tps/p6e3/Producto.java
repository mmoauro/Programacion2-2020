package p6e3;

public abstract class Producto {
    private boolean estoyAlquilado;

    public Producto () {
        this.estoyAlquilado = false;
    }

    public abstract boolean mePuedenAlquilar();
    public boolean getEstoyAlquilado () {
        return this.estoyAlquilado;
    }
    public void setEstoyAlquilado () {
        this.estoyAlquilado = true;
    }
}
