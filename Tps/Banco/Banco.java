package Banco;
public class Banco {
    private String nombre;
    private Cliente [] clientes;

    public Banco (String nombre) {
        this.nombre = nombre;
    }
    public void setClientes (Cliente [] cliente) {
        this.clientes = clientes;
    }
    public void transferenciaDinero (Cliente [] clientes, int cantidad) {
        // El primer cliente le transfiere al segundo.
        if (clientes.length == 2) {
            if (clientes[0].getBanco().equals(this) && clientes[1].getBanco().equals(this)) {
                if (clientes[0].getSaldo() > 0) {
                    clientes[0].retirarDinero(cantidad);
                    clientes[1].depositarDinero(cantidad);
                    System.out.println("El nuevo saldo de " + clientes[0].getNombre() + "es: " + clientes[0].getSaldo());
                    System.out.println("El nuevo saldo de " + clientes[1].getNombre() + "es: " + clientes[1].getSaldo());
                }
                else {
                    System.out.println(clientes[0].getNombre() + " no tiene saldo suficiente.");
                }
            }
            else {
                System.out.println("Los clientes no pertenecen al mismo banco.");
            }
        }
        else {
            System.out.println("La cantidad de clientes tienen que ser dos.");
        }

    }
}