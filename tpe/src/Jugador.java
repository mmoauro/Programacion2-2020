import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private Mazo mazo;

    public Jugador (String nombre) {
        this.nombre = nombre;
        this.mazo = new Mazo();
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
    public int elegirAtributo () {
        return (int) (Math.random()*this.mazo.getPrimerCarta().getAtributos().size());
        // Devuelve algun atributo
        // carta.getAtributo(este metodo).valor. Para j1 y j2.
    }
}
