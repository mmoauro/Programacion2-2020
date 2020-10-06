package p6e4;

public class Proceso {
    private int memoriaRequerida;

    public Proceso (int memoriaRequerida) {
        this.memoriaRequerida = memoriaRequerida;
    }
    public int getMemoriaRequerida () {
        return this.memoriaRequerida;
    }
    public void ejecutar () {
        System.out.println("Ejecutando");
    }
}
