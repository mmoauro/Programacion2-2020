package p5e5;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa (String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public double getTodosLosSueldos () {
        double total = 0;
        for (Empleado empleado:this.empleados) {
            total+=empleado.getSueldoMensual();
        }
        return total;
    }
}
