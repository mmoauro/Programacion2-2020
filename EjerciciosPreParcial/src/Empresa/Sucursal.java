package Empresa;

import java.util.ArrayList;
import java.util.Collections;

public class Sucursal implements ElementoEmpresaAbs {
    private ArrayList<Grupo> grupos;

    public Sucursal () {
        this.grupos = new ArrayList<>();
    }

    @Override
    public int getCantidadEmpleadosPorEspecialidad(String especialidad) {
        int total = 0;
        for (Grupo g:this.grupos) {
            total += g.getCantidadEmpleadosPorEspecialidad(especialidad);
        }
        return total;
    }

    @Override
    public String getEspecialidad() {
        ArrayList<String> especialidades = new ArrayList<>();
        String mayor = "";
        int cant = 0;
        for (Grupo g:this.grupos) {
            especialidades.add(g.getEspecialidad());
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
        for (Grupo g:this.grupos) {
            retorno.addAll(g.getEmpleadosPorEspecialidad(especialidad));
        }
        return retorno;
    }
}
