package p4e4;

import java.time.LocalDate;

public class Entrenador extends Persona {
    private int identificadorFederacion;

    public Entrenador (String nombre, String apellido, int numeroPasaporte, LocalDate fechaNacimiento, int identificadorFederacion) {
        super(nombre, apellido, numeroPasaporte, fechaNacimiento);
        this.identificadorFederacion = identificadorFederacion;
    }
}
