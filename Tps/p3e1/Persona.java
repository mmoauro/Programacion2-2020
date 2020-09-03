package p3e1;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaDeNacimieno;
    private boolean esHombre;
    private String dni;
    private int peso;
    private double altura;

    public Persona (String dni) {
        this.dni = dni;
        this.edad = 20;
        this.fechaDeNacimieno = LocalDate.of(2000, 1, 1);
        this.esHombre = false;
        this.nombre = "n";
        this.apellido = "n";
        this.peso = 1;
        this.altura = 1;
    }
    public Persona (String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = 20;
        this.fechaDeNacimieno = LocalDate.of(2000, 1, 1);
        this.esHombre = false;
        this.peso = 1;
        this.altura = 1;
    }
    public Persona (String nombre, String apellido, String dni, LocalDate fechaDeNacimieno, int edad, boolean esHombre, int peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.fechaDeNacimieno = fechaDeNacimieno;
        this.esHombre = esHombre;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc () {
        return this.peso / (this.altura * this.altura);
    }
    public boolean estaEnForma () {
        return this.calcularImc() > 18.5 && this.calcularImc() < 25;
    }
    public boolean esMayorDeEdad () {
        return this.edad >= 18;
    }
    public boolean puedeVotar () {
        return this.edad >= 16;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaDeNacimieno(LocalDate fechaDeNacimieno) {
        this.fechaDeNacimieno = fechaDeNacimieno;
    }

    public void setEsHombre(boolean esHombre) {
        this.esHombre = esHombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", fechaDeNacimieno='" + fechaDeNacimieno + '\'' +
                ", esHombre=" + esHombre +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    public void setFechaDeNacimiento (LocalDate fechaDeNacimieno) {
        this.fechaDeNacimieno = fechaDeNacimieno;
    }
    public LocalDate getFechaDeNacimieno () {
        return this.fechaDeNacimieno;
    }
    public boolean estaCumpliendoAnios () {
        return this.getFechaDeNacimieno().getMonth() == LocalDate.now().getMonth() && this.getFechaDeNacimieno().getDayOfMonth() == LocalDate.now().getDayOfMonth();
    }
}
