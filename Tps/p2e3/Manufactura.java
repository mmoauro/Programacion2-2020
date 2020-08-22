package p2e3;
public class Manufactura {
    private String tipo; // Puede ser una silla, una mesa, o un banco.
    private int peso; // En kg.
    private int costoFabricacion;
    private int valorVenta; // Es el costo de fabricacion mas el 35%
    private String tipoMadera;
    private String color;
    private boolean estaEnStock;

    public Manufactura (String tipo, int peso, int costoFabricacion, String tipoMadera, String color) {
        this.tipo = tipo;
        this.peso = peso;
        this.costoFabricacion = costoFabricacion;
        this.valorVenta = costoFabricacion + ((35 * costoFabricacion) / 100);
        this.tipoMadera = tipoMadera;
        this.color = color;
        this.estaEnStock = true;
    }
    public void setStockToFalse () {
        this.estaEnStock = false;
    }
    public void setStockToTrue () {
        this.estaEnStock = true;
    }
    public boolean getStock () {
        return this.estaEnStock;
    }
    public int getValorVenta () {
        return this.valorVenta;
    }
}