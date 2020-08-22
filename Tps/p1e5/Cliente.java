package p1e5;

public class Cliente {
    private String nombre;
    private int cantidadTurnos;
    
    public Cliente (String nombre) {
        this.nombre = nombre;
        this.cantidadTurnos = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void aumentarTurno () {
        this.cantidadTurnos++;
    }

    public boolean esFrecuente () {
        return this.cantidadTurnos > 1;
    }
}