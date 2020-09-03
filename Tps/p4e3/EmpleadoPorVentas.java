package p4e3;

public class EmpleadoPorVentas extends Empleado {
    private int ventas;

    public EmpleadoPorVentas (String nombre, double sueldoFijo, int ventas) {
        super(nombre, sueldoFijo);
        this.ventas = ventas;
    }

    public double getSueldo() {
        // Recibe ventas% mas de su sueldo.
        return super.getSueldo() + ((ventas*super.getSueldo()) / 100);
    }
}
