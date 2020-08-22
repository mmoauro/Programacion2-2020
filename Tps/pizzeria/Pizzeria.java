package pizzeria;
public class Pizzeria {
    private String nombre;
    private Cocinero [] cocineros;
    private int [] ventas;
    private Pizza [] pizzas;

    public Pizzeria (String nombre, Cocinero [] cocineros, Pizza [] pizzas) {
        this.nombre = nombre;
        this.cocineros = cocineros;
        this.pizzas = pizzas;
    }

    public void realizarPedido (Comprador comprador, Cocinero cocinero, Pizza [] pizzas) {
        int totalPrecioPizzas = 0;
        int precioEnvio = 0;
        for (Pizza pizza : pizzas) {
            totalPrecioPizzas += pizza.getPrecio();
        }
        if (comprador.estudiaEnExactas()) {
            precioEnvio = 10 * comprador.getDistancia();
        }
        else {
            precioEnvio = 20 *comprador.getDistancia();
        }
        cocinero.setPizzaCocinada();
        int total = precioEnvio + totalPrecioPizzas;
        System.out.println("Tu envio esta en camino. El total a abonar es: " + total);
    }
    public void setPromo (Pizza pizza, int descuento) {
        int precio = pizza.getPrecio();
        int nuevoPrecio = precio - ((descuento * precio) / 100);
        pizza.setPrecio(nuevoPrecio);
    }
}