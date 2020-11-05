public class PocimaCocktail extends Pocima {
    private Pocima p1;
    private Pocima p2;

    public PocimaCocktail (String nombre, Pocima p1, Pocima p2) {
        super(nombre);
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double getValorAtributo(Atributo atr) {
        double valor = p1.getValorAtributo(atr);
        Atributo a = new Atributo(atr.getNombre(), valor);
        valor = p2.getValorAtributo(a);
        return valor;
    }
}
