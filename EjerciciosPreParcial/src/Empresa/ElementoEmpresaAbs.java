package Empresa;

import java.util.ArrayList;

public interface ElementoEmpresaAbs {
    int getCantidadEmpleadosPorEspecialidad(String especialidad);
    String getEspecialidad();
    ArrayList<Empleado> getEmpleadosPorEspecialidad (String especialidad);
}
