import java.util.ArrayList;

public class PocimaCocktail implements Pocima {
    private ArrayList<Pocima> pocimas;

    public PocimaCocktail (ArrayList<Pocima> pocimas) {
        this.pocimas = pocimas;
    }

    @Override
    public void cambairValores(Carta c) {
        for (Pocima pocima: this.pocimas) {
            pocima.cambairValores(c);
        }
    }
}
