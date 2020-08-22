package Banco;
public class Cliente {
    private String nombre;
    private int saldo;
    private Banco banco;

    public Cliente (String nombre, Banco banco) {
        this.nombre = nombre;
        this.saldo = 0;
        this.banco = banco;
    }

    public void depositarDinero (int cantidad) {
        this.saldo += cantidad;
    }
    public void retirarDinero (int cantidad) {
        if (this.saldo > 0) {
            this.saldo -= cantidad;
        }
        else {
            System.out.println("No tenes dinero para retirar.");
        }
    }
    public int getSaldo () {
        return this.saldo;
    }
    public String getNombre() {
        return this.nombre;
    }
    public Banco getBanco () {
        return this.banco;
    }
    
}