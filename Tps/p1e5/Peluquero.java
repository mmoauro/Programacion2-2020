package p1e5;

public class Peluquero {
    private String nombre;
    private String [] turnos = new String[10];

    public Peluquero (String nombre) {
        this.nombre = nombre;
    }
    public void llenarTurnos () {
        for (int i = 0; i < this.turnos.length; i++) {
            this.turnos[i] = "Turno vacio";
        }
    }
    public int obtenerPosicionTurno () {
        int i = 0;
        while (this.turnos[i] != "Turno vacio" && i < turnos.length - 1){
            i++;
        }
        return i;
    }

    public String getNombre () {
        return this.nombre;
    }
    public void addTurno (Cliente cliente) {
        int posTurno = this.obtenerPosicionTurno();
        this.turnos[posTurno] = cliente.getNombre();
    }

    public String getPrimerTurno () {
        return "El primer turno de " + this.nombre + " es: " + this.turnos[0];
    }
    public void getTurnos () {
        for (int i = 0; i < turnos.length; i++) {
            System.out.println(turnos[i]);
        }
    }
} 