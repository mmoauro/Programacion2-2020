package p4e3;

public class EmpleadoPorHoras extends Empleado{
    private int horas;

    public EmpleadoPorHoras (String nombre, double sueldoFijo, int horas) {
        super(nombre, sueldoFijo);
        this.horas = horas;
    }
    public double getSueldo () {
        // Recibe horas% mas de su sueldo
        return super.getSueldo() + ((this.horas*super.getSueldo())/100);
    }
}
