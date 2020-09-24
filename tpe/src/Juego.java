public class Juego {
    private Mazo mazo;
    private Jugador j1;
    private Jugador j2;
    private int cantRondas;

    public Juego (Mazo mazo, Jugador j1, Jugador j2, int cantRondas) {
        this.mazo = mazo;
        this.j1 = j1;
        this.j2 = j2;
        this.cantRondas = cantRondas;
    }

    public void jugar () {
        int rondasJugadas = 0;
        mazo.repartir(this.j1, this.j2);
        // TODO: Empieza eligiendo el atributo el jugador 1. Despues, elige el atributo el que gane la ronda
        // Mientras hayan rondas, y los dos jugadores tengan cartas
            // Si es la primer ronda, elige el atributo el j1
            // Obtengo el ganador de la ronda
            // En cada ronda siguiente elige el atributo el ganador de la ultima ronda
            // Mientras gane el j1, elige el j1
            // Mientras gane el j2, elige el j2
        while (rondasJugadas < this.cantRondas && this.j1.getCantidadCartas() > 0 && this.j2.getCantidadCartas() > 0) {
            Jugador ganador = null;
            int atr = 0;
            if (cantRondas == 0) {
                atr = j1.elegirAtributo();
                Carta cartaJ1 = this.j1.getPrimerCarta();
                Carta cartaJ2 = this.j2.getPrimerCarta();
                ganador = this.getGanadorRonda(atr, cartaJ1, cartaJ2);
            }
            while (ganador.equals(this.j1)) {
                atr = j1.elegirAtributo();
                Carta cartaJ1 = this.j1.getPrimerCarta();
                Carta cartaJ2 = this.j2.getPrimerCarta();
                ganador = this.getGanadorRonda(atr, cartaJ1, cartaJ2);
                this.cambiarEstadoCartasJugadores(ganador, cartaJ1, cartaJ2);
            }
            while (ganador.equals(this.j2)) {
                atr = j2.elegirAtributo();
                Carta cartaJ1 = this.j1.getPrimerCarta();
                Carta cartaJ2 = this.j2.getPrimerCarta();
                ganador = this.getGanadorRonda(atr, cartaJ1, cartaJ2);
                this.cambiarEstadoCartasJugadores(ganador, cartaJ1, cartaJ2);
            }
            // Incrementar rondas jugadas
        }

    }
    public Jugador getGanadorRonda (int atr, Carta cartaj1, Carta cartaj2) {
        for (int i = 0; i < cartaj1.getPersonaje().getAtributos().size(); i++) {
            if (cartaj1.getPersonaje().getAtributos().get(i).getNumero() == atr) {
                if (cartaj1.getPersonaje().getAtributos().get(i).getValor() > cartaj2.getPersonaje().getAtributos().get(i).getValor()) {
                    return j1; // Gana jugador 1
                }
                else if (cartaj1.getPersonaje().getAtributos().get(i).getValor() < cartaj2.getPersonaje().getAtributos().get(i).getValor()) {
                    return j2; // Gana jugador 2
                }
                else {
                    return null; // Empatan
                }
            }
        }
        return null;
    }
    public void cambiarEstadoCartasJugadores (Jugador j, Carta c1, Carta c2) {
        // Recibe el jugador que gano la ronda.
        // c1 es la carta del jugador 1
        // c2 es la carta del jugador 2
        if (j.equals(this.j1)) {
            j1.removePrimerCarta();
            j1.addCarta(c1);
            j1.addCarta(c2);
            j2.removePrimerCarta();
        }
        else if (j.equals(this.j2)) {
            j2.removePrimerCarta();
            j2.addCarta(c1);
            j2.addCarta(c2);
            j1.removePrimerCarta();
        }
        else {
            j1.removePrimerCarta();
            j1.addCarta(c1);
            j2.removePrimerCarta();
            j2.addCarta(c2);
        }
    }
}
