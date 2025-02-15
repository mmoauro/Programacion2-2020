public class PocimaReductora extends Pocima {
    // Reduce el valor de todos los atributos un % especifico.
    private double porcentaje; // Valor entre 0 y 1.

    public PocimaReductora (String nombre, double porcentaje) {
        super(nombre);
        this.porcentaje = porcentaje;
    }

    @Override
    public double getValorAtributo (Atributo atr) {
        return atr.getValor() - atr.getValor() * this.porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
