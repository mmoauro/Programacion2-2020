package p5e5;

public class Empleado {
    private String nombre;
    private String apellido;
    private double sueldoMensual;
    private String dni;

    public Empleado(String nombre, String apellido, double sueldoMensual, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoMensual = sueldoMensual;
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombre + ' ' + apellido;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
}
