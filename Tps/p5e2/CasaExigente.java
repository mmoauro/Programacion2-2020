package p5e2;

public class CasaExigente extends Casa {

    public CasaExigente (int cantidadAlumnosMaxima, int codigo) {
        super(cantidadAlumnosMaxima, codigo);
    }

    public boolean alumnoPuedeIngresar(Alumno alumno) {
        int i = 0;
        for (int j = 0; j < super.getAlumnos().size(); j++) {
            if (super.getAlumno(j).getFamiliares().contains((alumno))) {
                i++;
                break;
            }
        }
        return super.alumnoPuedeIngresar(alumno) && i != 0;
    }
}
