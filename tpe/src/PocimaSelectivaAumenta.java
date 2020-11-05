public class PocimaSelectivaAumenta extends Pocima {
    // Aumenta el valor de un atributo dado en el constructor un % especifico.
    private String nombreAtributo;
    private double porcentaje; // Valor entre 0 y 1.

    public PocimaSelectivaAumenta (String nombre, String atr, double porcentaje) {
        super(nombre);
        this.nombreAtributo = atr;
        this.porcentaje = porcentaje;
    }

    @Override
    public double getValorAtributo (Atributo atr) {
        if (atr.getNombre().equals(this.nombreAtributo))
            return atr.getValor() + atr.getValor() * this.porcentaje;
        return atr.getValor();
    }
    public void setAtributo (String nombre) {
        this.nombreAtributo = nombre;
    }
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
