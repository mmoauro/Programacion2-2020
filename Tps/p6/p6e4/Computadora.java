package p6e4;

public class Computadora {
    private int velocidad;
    private boolean estaDisponible;

    public Computadora (int velocidad) {
        this.velocidad = velocidad;
        this.estaDisponible = true;
    }

    public boolean getEstaDisponible() {
        return this.estaDisponible;
    }
    public void setEstaDisponible (boolean a) {
        this.estaDisponible = a;
    }
    public int getVelocidad () {
        return this.velocidad;
    }
}
