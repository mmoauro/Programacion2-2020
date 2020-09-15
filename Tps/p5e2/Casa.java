package p5e2;

import java.util.ArrayList;

public class Casa {
    private int codigo;
    private ArrayList<String> cualidadesNecesarias;
    private ArrayList<Alumno> alumnos;
    private int cantidadAlumnosMaxima;

    public Casa (int cantidadAlumnosMaxima, int codigo) {
        this.cantidadAlumnosMaxima = cantidadAlumnosMaxima;
        this.codigo = codigo;
        this.cualidadesNecesarias = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }
    public boolean estaLlena () {
        return this.cantidadAlumnosMaxima == this.alumnos.size();
    }
    public void agregarAlumno (Alumno alumno) {
        if (this.alumnoPuedeIngresar(alumno) && !this.estaLlena()) {
            this.alumnos.add(alumno);
        }
    }
    public boolean alumnoPuedeIngresar (Alumno alumno) {
        int i = 0;
        if (!alumno.estaEnUnaCasa() && this.cualidadesNecesarias.size() > 0) {
            for (String cualidad:this.cualidadesNecesarias) {
                if (alumno.getCualidades().contains(cualidad)) {
                    i++;
                }
            }
        }
        return i == cualidadesNecesarias.size();
    }
    public ArrayList getAlumnos () {
        return this.alumnos;
    }
    public Alumno getAlumno (int pos) {
        return this.alumnos.get(pos);
    }
    public boolean equals (Object obj) {
        Casa nueva = (Casa) obj;
        return nueva.getCodigo() == this.getCodigo();
    }
    public int getCodigo () {
        return this.codigo;
    }

}
