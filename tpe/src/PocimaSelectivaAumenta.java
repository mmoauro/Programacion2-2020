public class PocimaSelectivaAumenta implements Pocima {
    // Aumenta el valor de un atributo dado en el constructor un % especifico.
    private String nombreAtributo;
    private double porcentaje; // Valor entre 0 y 1.

    public PocimaSelectivaAumenta (String nombre, double porcentaje) {
        this.nombreAtributo = nombre;
        this.porcentaje = porcentaje;
    }

    @Override
    public void cambairValores(Carta c) {
        int cantidad = c.getCantidadAtributos();

        for (int i = 0; i < cantidad; i++) {
            Atributo atr = c.getAtributo(i);
            if (atr.getNombre().equals(this.nombreAtributo)) {
                double valor = atr.getValor();
                atr.setValor(valor - valor * this.porcentaje);
            }
        }
    }
    public void setAtributo (String nombre) {
        this.nombreAtributo = nombre;
    }
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
