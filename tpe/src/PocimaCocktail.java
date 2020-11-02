public class PocimaCocktail extends Pocima {
    private Pocima p1;
    private Pocima p2;

    public PocimaCocktail (String nombre, Pocima p1, Pocima p2) {
        super(nombre);
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void cambairValores(Carta c) {
        this.p1.cambairValores(c);
        this.p2.cambairValores(c);
    }
}
