public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Manuel");
        Jugador j2 = new Jugador("Pedro");

        String mazoPath = "tpe/superheroes.json";
        Mazo m1 = new Mazo();
        m1.cargarMazo(mazoPath);
        j1.setEstrategia(new EstrategiaAmbicioso());

        Juego juego = new Juego(m1, j1, j2, 10);

        Pocima p1 = new PocimaFortalecedora("Pocima fortalecedora", 0.4);
        Pocima p2 = new PocimaSelectivaReductora("Pocima selectiva reductora peso", "peso", 0.1);

        juego.addPocima(p1);
        juego.addPocima(p2);
        juego.jugar();

    }
}
