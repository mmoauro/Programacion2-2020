package p3e2;
public class Electrodomestico {
    private String nombre;
    private double precioBase;
    private String color;
    private int consumo; // En Kw.
    private double peso; // En Kg.

    public Electrodomestico (String nombre) {
        this.nombre = nombre;
        this.precioBase = 100;
        this.color = "Gris plata";
        this.consumo = 10;
        this.peso = 2;
    }
    public Electrodomestico (String nombre, double precioBase, String color, int consumo, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public boolean esBajoConsumo () {
        return this.consumo < 45;
    }
    public double calcularBalance () {
        return this.precioBase / this.peso;
    }
    public boolean esGamaAlta () {
        return this.calcularBalance() > 3;
    }
}
