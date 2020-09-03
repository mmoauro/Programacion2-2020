package p4e4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona manu = new Jugador("Manuel", "Moauro", 123, LocalDate.of(2001, 10, 17), "Derecha", "Delantero");
        ArrayList<Persona> personal = new ArrayList<Persona>();
        personal.add(manu);
        Contingente argentina = new Contingente("Argentina", personal);
        System.out.println(argentina.estaDisponible(1));
    }
}
