package p4e3;

public class Empleado {
    private String nombre;
    private double sueldoFijo;

    public Empleado (String nombre, double sueldoFijo) {
        this.nombre = nombre;
        this.sueldoFijo = sueldoFijo;
    }
    public double getSueldo () {
        return this.sueldoFijo;
    }


}
