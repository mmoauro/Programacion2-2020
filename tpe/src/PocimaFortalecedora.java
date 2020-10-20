public class PocimaFortalecedora implements Pocima {
    // Aumenta el valor de todos los atributos un % especifico.
    private double porcentaje; // Valor entre 0 y 1.

    public PocimaFortalecedora (double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void cambairValores(Carta c) {
        int cantidad = c.getCantidadAtributos();

        for (int i = 0; i < cantidad; i++) {
            Atributo atr = c.getAtributo(i);
            atr.setValor(atr.getValor() + atr.getValor() * this.porcentaje);
        }
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}