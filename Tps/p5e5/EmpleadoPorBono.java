package p5e5;

public class EmpleadoPorBono extends Empleado {
    private int catidadVentas = 0;
    private int dineroDelBono;
    private int ventasParaAlcanzarBono;

    public EmpleadoPorBono(String nombre, String apellido, double sueldoMensual, String dni, int dineroDelBono, int ventasParaAlcanzarBono) {
        super(nombre, apellido, sueldoMensual, dni);
        this.dineroDelBono = dineroDelBono;
        this.ventasParaAlcanzarBono = ventasParaAlcanzarBono;
    }
    public double getSueldoMensual() {
        if (this.catidadVentas >= this.ventasParaAlcanzarBono) {
            return super.getSueldoMensual() + dineroDelBono;
        }
        return super.getSueldoMensual();
    }
}
