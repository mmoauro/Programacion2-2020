package Banco;
public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco("Santander");
        Banco bbva = new Banco("BBVA");
        Cliente baru = new Cliente ("Baru", santander);
        Cliente pelu = new Cliente ("Pelu", bbva);
        Cliente [] clientes = {baru, pelu};
        baru.depositarDinero(1000);
        santander.transferenciaDinero(clientes, 100);
    }
}