public class PocimaValorConstante extends Pocima {
    // Cambia el valor de todos los atributos en un valor dado en el constructor.
    private double valor; // Valor entre 0 y 1.

    public PocimaValorConstante (String nombre, double valor) {
        super(nombre);
        this.valor = valor;
    }

    @Override
    public double getValorAtributo (Atributo atr) {
        return this.valor;
    }

    public void setValor (double valor) {
        this.valor = valor;
    }
}
