public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Manuel");
        Jugador j2 = new Jugador("Pedro");

        String mazoPath = "tpe/autos.json";
        Mazo m1 = new Mazo();
        m1.cargarMazo(mazoPath);
        j1.setEstrategia(new EstrategiaAmbicioso());

        Juego juego = new Juego(m1, j1, j2, 150);

        Pocima p1 = new PocimaFortalecedora("Pocima fortalecedora", 1);
        Pocima p2 = new PocimaSelectivaReductora("Pocima selectiva reductora RPM", "RPM", 1);

        juego.addPocima(p1);
        juego.addPocima(p2);
        juego.jugar();

    }
}
