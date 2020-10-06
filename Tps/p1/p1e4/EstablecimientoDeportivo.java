package p1e4;

public class EstablecimientoDeportivo {
    private int turnosFutbol; //El maximo de turnos es 2
    private int turnosPaddle; //EL maximo de turnos es 4
    
    public EstablecimientoDeportivo () {
        this.turnosFutbol = 2;
        this.turnosPaddle = 4;
    }
    public void reservarFutbol (Jugador jugador) {
        if (this.turnosFutbol > 0) {
            this.turnosFutbol -= 1;
            jugador.addAlquiler();
            if (jugador.esSocio()) {
                System.out.println("El costo de la cancha es 90.");
            }
            else {
                System.out.println("El costo de la cancha es 100.");
            }
        }
        else {
            System.out.println("No hay canchas disponible mostro");
        }
    }
    public void reservarPaddle (Jugador jugador) {
        if (this.turnosPaddle > 0) {
            this.turnosPaddle -= 1;
            jugador.addAlquiler();
            if (jugador.esSocio()){
                System.out.println("El precio de la cancha es 360.");
            }
            else {
                System.out.println("El precio de la cancha es 400.");
            }
        }
        else {
            System.out.println("No hay canchas disponibles papa");
        }
    }
}