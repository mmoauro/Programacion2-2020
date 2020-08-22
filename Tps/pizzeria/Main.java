package pizzeria;
public class Main {
    public static void main(String[] args) {
        Comprador baru = new Comprador("Manuel", 10);
        Cocinero pelu = new Cocinero("Pelu");
        Pizza muzzarella = new Pizza("Muzzarella", 450);
        Cocinero [] cocineros = {pelu};
        Pizza [] pizzas = {muzzarella};
        Pizzeria donPepone = new Pizzeria("Don Pepone", cocineros, pizzas);
        donPepone.realizarPedido(baru, pelu, pizzas);
        donPepone.setPromo(muzzarella, 50);
        baru.setEstudiaExactas();
        donPepone.realizarPedido(baru, pelu, pizzas);
    }
}