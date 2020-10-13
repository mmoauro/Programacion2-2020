public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Manuel");
        Jugador j2 = new Jugador("Pedro");

        String mazoPath = "tpe/superheroes.json";
        Mazo m1 = new Mazo();
        m1.cargarMazo(mazoPath);

        Juego juego = new Juego(m1, j1, j2, 20);
        juego.jugar();

    }
}
