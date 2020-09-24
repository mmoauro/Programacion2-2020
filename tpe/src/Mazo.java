import java.util.ArrayList;

public class Mazo {
    private ArrayList<Carta> cartas;

    public Mazo () {
        this.cartas = new ArrayList<>();
    }

    public void addCarta (Carta carta) {
        if (this.cartas.size() == 0) {
            cartas.add(carta);
        }
        else if (this.cartas.get(0).equals(carta)) {
            cartas.add(carta);
        }
        // Verifico que las cartas tengan los mismos atributos.
    }

    public ArrayList<Carta> getCartas() {
        return this.cartas;
    }
    public void repartir (Jugador j1, Jugador j2) {
        for (int i = 0; i < this.cartas.size(); i++) {
            if (i % 2 == 0) {
                j1.addCarta(this.cartas.get(i));
            }
            else {
                j2.addCarta(this.cartas.get(i));
            }
        }
        // El mazo se vacia?
    }
}
