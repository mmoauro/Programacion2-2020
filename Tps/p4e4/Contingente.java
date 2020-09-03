package p4e4;

import java.util.ArrayList;

public class Contingente {
    private ArrayList<Persona> personal;
    private String pais;

    public  Contingente (String pais, ArrayList personal) {
        this.personal = personal;
        this.pais = pais;
    }
    public void agregarPersona (Persona persona) {
        this.personal.add(persona);
    }
    public boolean estaDisponible (int numeroPersona) {
        if (numeroPersona >= 0 && numeroPersona < this.personal.size()) {
            return this.personal.get(numeroPersona).estaDisponible();
        }
        System.out.println("Esa persona no existe.");
        return  false;
    }
}
