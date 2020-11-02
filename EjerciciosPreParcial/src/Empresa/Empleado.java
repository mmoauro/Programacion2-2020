package Empresa;

import java.util.ArrayList;

public class Empleado implements ElementoEmpresaAbs{
    private String especialidad;
    private double sueldo;

    public Empleado (String especialidad, double sueldo) {
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }


    public double getSueldo() {
        return this.sueldo;
    }

    @Override
    public int getCantidadEmpleadosPorEspecialidad(String especialidad) {
        return this.especialidad == especialidad ? 1 : 0;
    }

    @Override
    public String getEspecialidad () {
        return this.especialidad;
    }

    @Override
    public ArrayList<Empleado> getEmpleadosPorEspecialidad(String especialidad) {
        ArrayList<Empleado> retorno = new ArrayList<>();
        if (this.especialidad.equals(especialidad))
            retorno.add(this);
        return retorno;
    }
}
