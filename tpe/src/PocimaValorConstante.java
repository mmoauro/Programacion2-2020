public class PocimaValorConstante implements Pocima {
    // Cambia el valor de todos los atributos en un valor dado en el constructor.
    private double valor; // Valor entre 0 y 1.

    public PocimaValorConstante (double valor) {
        this.valor = valor;
    }

    @Override
    public void cambairValores(Carta c) {
        int cantidad = c.getCantidadAtributos();

        for (int i = 0; i < cantidad; i++) {
            Atributo atr = c.getAtributo(i);
            atr.setValor(this.valor);
        }
    }
    public void setValor (double valor) {
        this.valor = valor;
    }
}
