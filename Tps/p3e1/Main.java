package p3e1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "Moauro", "43.659.071", LocalDate.of(2001, 10, 17), 18, true, 70, 1.83);
        System.out.println(manuel.estaCumpliendoAnios());
    }
}
