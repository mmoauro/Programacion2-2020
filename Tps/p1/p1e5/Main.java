package p1e5;

public class Main {
    public static void main(String[] args) {
        Peluquero portelie = new Peluquero("Portela");
        portelie.llenarTurnos();
        Peluquero elHijo = new Peluquero("El hijo");
        Peluquero baru = new Peluquero("Baruca");
        Peluquero pelu = new Peluquero("Pelu");
        Peluquero [] pelucas = {portelie, elHijo, baru, pelu};
        Peluqueria portela = new Peluqueria("Portela", pelucas);
        portela.llenarTurnos();
        Cliente manuel = new Cliente("Manuel");
        Cliente claudio = new Cliente("Claudio");
        portela.reservarTurno(manuel, elHijo);
        portela.reservarTurno(claudio, portelie);
        portela.reservarTurno(manuel, portelie);
    }
}