package p4e1;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public  AlarmaLuminosa () {
        super();
        this.luz = new Luz("Rojo");
    }

    public boolean comprobar() {
        if (super.comprobar()) {
            this.luz.encender();
            return true;
        }
        return false;
    }
}
