package Empresa;

import java.util.ArrayList;
import java.util.Collections;

public class Empresa implements ElementoEmpresaAbs {
    private ArrayList<Sucursal> sucursales;

    public Empresa () {
        this.sucursales = new ArrayList<>();
    }


    @Override
    public int getCantidadEmpleadosPorEspecialidad(String especialidad) {
        int total = 0;
        for (Sucursal s:this.sucursales) {
            total += s.getCantidadEmpleadosPorEspecialidad(especialidad);
        }
        return total;
    }

    @Override
    public String getEspecialidad() {
        ArrayList<String> especialidades = new ArrayList<>();
        String mayor = "";
        int cant = 0;
        for (Sucursal s:this.sucursales) {
            especialidades.add(s.getEspecialidad());
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
        for (Sucursal s:this.sucursales) {
            retorno.addAll(s.getEmpleadosPorEspecialidad(especialidad));
        }
        return retorno;
    }
}
