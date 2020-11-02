public class Atributo {
    private String nombre;
    private double valor;
    private double valorInicial;
    // Por cada carta creo todos los atributos con distintos valores.


    public Atributo (String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
        this.valorInicial = valor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor (double valor) {
        this.valor = valor;
    }

    public double getValorInicial () {
        return this.valorInicial;
    }

    public boolean equals (Object o) {
        try {
            Atributo nuevo = (Atributo) o;
            return this.nombre.equals(nuevo.getNombre());
        }
        catch (Exception e) {
            return false;
        }
    }
}
