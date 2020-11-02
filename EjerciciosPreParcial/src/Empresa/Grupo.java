package Empresa;

import java.util.ArrayList;
import java.util.Collections;

public class Grupo implements ElementoEmpresaAbs {
    private ArrayList<Empleado> empleados;

    public Grupo () {
        this.empleados = new ArrayList<>();
    }

    @Override
    public int getCantidadEmpleadosPorEspecialidad(String especialidad) {
        int total = 0;
        for (Empleado e:this.empleados) {
            total += e.getCantidadEmpleadosPorEspecialidad(especialidad);
        }
        return total;
    }

    @Override
    public String getEspecialidad() {
        ArrayList<String> especialidades = new ArrayList<>();
        String mayor = "";
        int cant = 0;
        for (Empleado e:this.empleados) {
            especialidades.add(e.getEspecialidad());
        }
        for (String especialidad:especialidades) {
            if (Collections.frequency(especialidades, especialidad) > cant) {
                mayor = especialidad;
                cant = Collections.frequency(especialidades, especialidad);
            }
        }
        return mayor;
    }

    @Override
    public ArrayList<Empleado> getEmpleadosPorEspecialidad(String especialidad) {
        ArrayList<Empleado> retorno = new ArrayList<>();
        for (Empleado e:this.empleados) {
            retorno.addAll(e.getEmpleadosPorEspecialidad(especialidad));
        }
        return retorno;
    }
}
