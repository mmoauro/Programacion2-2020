import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private Mazo mazo;
    private Estrategia estrategia;

    public Jugador (String nombre) {
        this.nombre = nombre;
        this.mazo = new Mazo();
        this.estrategia = new EstrategiaTimbero(); // Estrategia por defecto.
    }

    public int getCantidadCartas () {
        return this.mazo.getCantidadCartas();
    }

    public String getNombre () {
        return this.nombre;
    }

    public void addCarta (Carta carta) {
        this.mazo.addCarta(carta);
    }

    public Carta getPrimerCarta () {
        return mazo.getPrimerCarta();
    }

    public void removePrimerCarta () {
        this.mazo.removePrimerCarta();
    }

    public void setEstrategia (Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public int elegirAtributo () {
        return this.estrategia.getAtributo(this.getPrimerCarta());
        // Devuelve algun atributo
        // carta.getAtributo(este metodo).valor. Para j1 y j2.
    }
}
