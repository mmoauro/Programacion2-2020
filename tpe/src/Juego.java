import java.util.ArrayList;

public class Juego {
    private Mazo mazo;
    private Jugador j1;
    private Jugador j2;
    private int cantRondas;
    private ArrayList<Pocima> pocimas;

    public Juego (Mazo mazo, Jugador j1, Jugador j2, int cantRondas) {
        this.mazo = mazo;
        this.j1 = j1;
        this.j2 = j2;
        this.cantRondas = cantRondas;
        this.pocimas = new ArrayList<>();
    }

    public void addPocima (Pocima pocima) {
        // Interpreto que se pueden repetir las pocimas en el arreglo.
        this.pocimas.add(pocima);
    }

    private void repartirPocimas() {
        for (Pocima pocima:this.pocimas) {
            int random = (int) (Math.random() * this.mazo.getCantidadCartas());
            Carta c = this.mazo.getCarta(random);
            c.setPocima(pocima);
        }
    }

    public void jugar () {
        this.mazo.mezclarCartas();
        this.repartirPocimas();
        this.mazo.repartir(this.j1, this.j2);

        String atr = this.j1.elegirAtributo();
        Carta c1 = this.j1.getPrimerCarta();
        Carta c2 = this.j2.getPrimerCarta();

        Jugador ganador = this.getGanador(atr, c1, c2);
        Jugador ultimoGanador = ganador;
        if (ganador == null) {
            ultimoGanador = this.j1;
        }

        int rondasJugadas = 1;
        this.actualizarCartas(ganador, c1, c2);
        this.imprimirRonda(rondasJugadas, this.j1, ganador, atr, c1, c2); // Le paso this.j1 porque es el jugador que eligio el atributo.

        while (rondasJugadas < this.cantRondas && this.j1.getCantidadCartas() > 0 && this.j2.getCantidadCartas() > 0) {
            c1 = this.j1.getPrimerCarta();
            c2 = this.j2.getPrimerCarta();

            if (ganador != null) { // Si hay un ganador
                atr = ganador.elegirAtributo();
                ultimoGanador = ganador;
            }
            else {
                // Si empataron
                atr = ultimoGanador.elegirAtributo();
            }
            ganador = this.getGanador(atr, c1, c2);

            this.actualizarCartas(ganador, c1, c2);
            rondasJugadas++;
            this.imprimirRonda(rondasJugadas, ultimoGanador, ganador, atr, c1, c2);
        }
        this.imprimirGanador();

    }

    private Jugador getGanador (String atr, Carta c1, Carta c2) {
        if (c1.getValorAtributoPocima(atr) > c2.getValorAtributoPocima(atr)) {
            return this.j1;
        }
        else if (c1.getValorAtributoPocima(atr) < c2.getValorAtributoPocima(atr)) {
            return this.j2;
        }
        else {
            return null;
        }
    }

    private void actualizarCartas (Jugador ganador,Carta primerCartaJ1,Carta primerCartaJ2 ) {
        if (ganador != null) {
            if (ganador.equals(this.j1)) {
                this.j1.addCarta(primerCartaJ1);
                this.j1.addCarta(primerCartaJ2);
                this.j1.removePrimerCarta();
                this.j2.removePrimerCarta();
            }
            else if (ganador.equals(this.j2)) {
                this.j2.addCarta(primerCartaJ2);
                this.j2.addCarta(primerCartaJ1);
                this.j2.removePrimerCarta();
                this.j1.removePrimerCarta();
            }
        }
        else {
            this.j1.addCarta(primerCartaJ1);
            this.j1.removePrimerCarta();
            this.j2.addCarta(primerCartaJ2);
            this.j2.removePrimerCarta();
        }
    }

    private void imprimirRonda (int nRonda, Jugador eligioCarta, Jugador ganador, String atr, Carta c1, Carta c2) {
        System.out.println("Ronda: " + (nRonda));
        System.out.println("El jugador " + eligioCarta.getNombre() +" eligio el atributo " + eligioCarta.getPrimerCarta().getAtributoPorNombre(atr).getNombre());
        String strJ1 = "La carta de " + this.j1.getNombre() + " es " + c1.getNombrePersonaje() + ", y el valor es: " + c1.getValorInicialAtributo(atr)+ ".";
        String strJ2 = "La carta de " + this.j2.getNombre() + " es " + c2.getNombrePersonaje() + ", y el valor es: " + c2.getValorInicialAtributo(atr) + ".";
        if (c1.tengoPocima()) {
            strJ1+= " Se aplico "+c1.getPocima() +", valor resultante: " + c1.getValorAtributoPocima(atr);
        }
        if (c2.tengoPocima()) {
            strJ2 += " Se aplico "+c2.getPocima() +", valor resultante: " + c2.getValorAtributoPocima(atr);
        }
        // Aunque la pocima no afecte al atributo en juego la muestro igual, porque la pocima se aplica de todas formas.
        System.out.println(strJ1);
        System.out.println(strJ2);
        System.out.println(this.j1.getNombre() + " tiene " + this.j1.getCantidadCartas() + " cartas.");
        System.out.println(this.j2.getNombre() + " tiene " + this.j2.getCantidadCartas() + " cartas.");
        if (ganador != null) {
            System.out.println("-------------------------- Gano la ronda "+ganador.getNombre()+" ---------------------------");
        }
        else {
            System.out.println("-------------------------- Empate ---------------------------");
        }
    }

    private void imprimirGanador () {
        if (this.j1.getCantidadCartas() > this.j2.getCantidadCartas())
            System.out.println("Gano " + this.j1.getNombre());

        else if (this.j1.getCantidadCartas() < this.j2.getCantidadCartas())
            System.out.println("Gano " + this.j2.getNombre());

        else
            System.out.println("Empate");
    }

}
