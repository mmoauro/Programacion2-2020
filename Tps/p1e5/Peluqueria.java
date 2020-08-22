package p1e5;

public class Peluqueria {
    private String nombre;
    private Peluquero [] peluqueros;
    private String[] turnos = new String[10];
    
    public Peluqueria (String nombre, Peluquero [] peluqueros) {
        this.nombre = nombre;
        this.peluqueros = peluqueros;
    }
    public void llenarTurnos () {
        for (int i = 0; i < turnos.length; i++) {
            turnos[i] = "Turno vacio";
        }
    }
    public int obtenerLugarTurno () {
        int i = 0;
        while (this.turnos[i] != "Turno vacio" && i < this.turnos.length - 1) {
            i++;
        }
        return i;
    }

    public void reservarTurno (Cliente cliente, Peluquero peluquero) {
        int posTurno = obtenerLugarTurno();
        this.turnos[posTurno] = posTurno + 1 + ": Cliente: " + cliente.getNombre() + " Peluquero: " + peluquero.getNombre();
        cliente.aumentarTurno();
        peluquero.addTurno(cliente);
    }

    public String getPrimerTurno () {
        return this.turnos[0];
    }
    public String getNombre () {
        return this.nombre;
    }
    public String getPeluqueros () {
        String s = "";
        for (int i = 0; i < peluqueros.length; i++) {
            s+= "Peluquero: " + peluqueros[i].getNombre() + "\n";
        }
        return s;
    }
}