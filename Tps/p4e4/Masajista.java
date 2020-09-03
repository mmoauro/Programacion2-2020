package p4e4;

import java.time.LocalDate;

public class Masajista extends Persona{
    private String titulo;
    private int aniosExperiencia;

    public Masajista (String nombre, String apellido, int numeroPasaporte, LocalDate fechaNacimiento, String titulo, int aniosExperiencia) {
        super(nombre, apellido, numeroPasaporte, fechaNacimiento);
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }
}
