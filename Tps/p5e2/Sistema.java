package p5e2;

import java.util.ArrayList;

public class Sistema {
    private String nombrEscuela;
    private ArrayList<Casa> casas;
    private ArrayList<Alumno> alumnos;

    public Sistema (String nombreEscuela) {
        this.nombrEscuela = nombreEscuela;
        this.casas = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }
    public void agregarAlumnoACasa (Casa casa, Alumno alumno) {
        if (this.casas.contains(casa) && this.alumnos.contains(alumno)) {
            casa.agregarAlumno(alumno);
            alumno.setCasa(casa);
        }
    }
    public void agregarCasa (Casa casa) {
        this.casas.add(casa);
    }
    public void agregarAlumno (Alumno alumno) {
        this.alumnos.add(alumno);
    }

}
