public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Manuel");
        Jugador j2 = new Jugador("Pedro");

        String mazoPath = "tpe/autos.json";
        Mazo m1 = new Mazo();
        m1.cargarMazo(mazoPath);
        j1.setEstrategia(new EstrategiaObstinado("cmd3"));

        Juego juego = new Juego(m1, j1, j2, 10);

        Pocima p1 = new PocimaFortalecedora("Pocima fortalecedora", 1);
        Pocima p2 = new PocimaFortalecedora("Pocima fortalecedora", 0.5);

        Pocima p3 = new PocimaReductora("Pocima reductora", 0.2);
        Pocima p4 = new PocimaReductora("Pocima reductora", 0.4);

        Pocima p5 = new PocimaValorConstante("Pocima valor constante", 3000);
        Pocima p6 = new PocimaValorConstante("Pocima valor constante", 1300);

        Pocima p7 = new PocimaSelectivaAumenta("Pocima selectiva aumenta RPM", "RPM", 0.7);
        Pocima p8 = new PocimaSelectivaAumenta("Pocima selectiva aumenta cm3", "cm3", 0.1);

        Pocima p9 = new PocimaSelectivaReductora("Pocima selectiva reductora cm3", "cm3", 0.2);
        Pocima p10 = new PocimaSelectivaReductora("Pocima selectiva reductora RPM", "RPM", 0.6);

        Pocima p11 = new PocimaCocktail("Pocima cocktail a", p7, p8);
        Pocima p12 = new PocimaCocktail("Pocima cocktail b", p8, p6);

        juego.addPocima(p1);
        juego.addPocima(p2);
        juego.addPocima(p3);
        juego.addPocima(p4);
        juego.addPocima(p5);
        juego.addPocima(p6);
        juego.addPocima(p7);
        juego.addPocima(p8);
        juego.addPocima(p9);
        juego.addPocima(p10);
        juego.addPocima(p11);
        juego.addPocima(p12);
        juego.jugar();

    }
}
