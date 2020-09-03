package p4e4;

import java.time.LocalDate;

public class Jugador extends Persona{
    private String posicion;
    private String piernaBuena;
    private int cantidadGoles;

    public  Jugador (String nombre, String apellido, int numeroPasaporte, LocalDate fechaNacimiento, String piernaBuena,  String posicion) {
        super(nombre, apellido, numeroPasaporte, fechaNacimiento);
        this.posicion = posicion;
        this.piernaBuena = piernaBuena;
        this.cantidadGoles = 0;
    }
}
