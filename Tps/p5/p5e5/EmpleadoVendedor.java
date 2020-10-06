package p5e5;

public class EmpleadoVendedor extends Empleado {
    private int cantidadDeVentas;
    private double porcentajeExtra;

    public EmpleadoVendedor(String nombre, String apellido, double sueldoMensual, String dni, double porcentajeExtra) {
        super(nombre, apellido, sueldoMensual, dni);
    }

    public double getSueldoMensual() {
        double porcentaje = porcentajeExtra * cantidadDeVentas / 100;
        return super.getSueldoMensual() + porcentaje * super.getSueldoMensual() / 100;
    }
    public void agregarVenta () {
        this.cantidadDeVentas++;
    }
}
