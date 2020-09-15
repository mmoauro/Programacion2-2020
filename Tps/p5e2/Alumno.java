package p5e2;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;
    private boolean estaEnUnaCasa;
    private Casa casaPerteneciente;

    public Alumno (String nombre, ArrayList<String> cualidades) {
        this.nombre = nombre;
        this.cualidades = cualidades;
        this.estaEnUnaCasa = false;
        this.familiares = new ArrayList<>();
    }

    public void addFamiliar (Alumno al) {
        this.familiares.add(al);
        al.addFamiliar(this);
    }
    public void addCualidad (String cualidad) {
        this.cualidades.add(cualidad);
    }

    public ArrayList getCualidades () {
        return this.cualidades;
    }
    public boolean estaEnUnaCasa () {
        return this.estaEnUnaCasa;
    }
    public boolean equals (Object obj) {
        Alumno nuevo = (Alumno) obj;
        return nuevo.getNombre() == this.getNombre() && nuevo.getCualidades() == this.getCualidades();
    }
    public String getNombre () {
        return  this.nombre;
    }
    public ArrayList getFamiliares () {
        return this.familiares;
    }
    protected void setCasa (Casa casa) {
        this.casaPerteneciente = casa;
        this.estaEnUnaCasa = true;
    }
    public Casa getCasaPerteneciente () {
        return this.casaPerteneciente;
    }
}