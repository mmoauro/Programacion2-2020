import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> cartas;

    public Jugador (String nombre) {
        this.nombre = nombre;
        this.cartas = new ArrayList<>();
    }

    public int getCantidadCartas () {
        return this.cartas.size();
    }
    public String getNombre () {
        return this.nombre;
    }
    public void addCarta (Carta carta) {
        this.cartas.add(carta);
    }
    public Carta getPrimerCarta () {
        if (this.cartas.size() > 0) {
            return this.cartas.get(0);
        }
        return null;
    }
    public void removePrimerCarta () {
        this.cartas.remove(0);
    }
    public int elegirAtributo () {
        return (int) (Math.random()*Atributo.getCantAtributos())+1;
    }
}
