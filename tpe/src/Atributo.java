public class Atributo {
    private String nombre;
    private double valor;
    private static int cantAtributos = 0;
    private int numero;
    // TODO: Tengo que encapsular el valor de un atributo para cada personaje

    public Atributo (String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
        cantAtributos++;
        this.numero = cantAtributos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getValor() {
        return this.valor;
    }
    public static int getCantAtributos () {
        return Atributo.cantAtributos;
    }
    public int getNumero () {
        return this.numero;
    }
}
