package p4e4;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int numeroPasaporte;
    private LocalDate fechaNacimiento;
    private String estado;
    private boolean estaConcentrado;

    public Persona (String nombre, String apellido, int numeroPasaporte, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroPasaporte = numeroPasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = "En pais de origen";
        this.estaConcentrado = true;
    }
    public void setEstado (String estado) {
        this.estado = estado;
    }
    public String getEstado () {
        return this.estado;
    }
    public boolean estaDisponible () {
        return !this.estaConcentrado && this.estado == "En pais de origen";
    }

}
