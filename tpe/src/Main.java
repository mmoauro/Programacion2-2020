public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Manuel");
        Jugador j2 = new Jugador("Pedro");

        //String mazoPath = "./superheroes.json";
        // Notebook
        String mazoPath = "/home/manuel/Documents/Facultad/Segundo cuatrimestre/Programacion2/tpe/src/superheroes.json";
        Mazo m1 = new Mazo();
        //Escritorio
        //String mazoPath = "C:/Users/Manuel/Documents/Facultad/Programacion2/tpe/src/superheroes.json";
        m1.cargarMazo(mazoPath);

        Juego juego = new Juego(m1, j1, j2, 1);
        juego.jugar();

    }
}
