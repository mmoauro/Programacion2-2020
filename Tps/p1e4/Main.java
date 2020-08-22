package p1e4;
public class Main {
    public static void main(String[] args) {
        Jugador baru = new Jugador("Manuel");
        EstablecimientoDeportivo nahuel = new EstablecimientoDeportivo();
        for (int i = 0; i < 6; i++) {
            nahuel.reservarPaddle(baru);
            nahuel.reservarFutbol(baru);
        }
    }
    
}