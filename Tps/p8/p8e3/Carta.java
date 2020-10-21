package p8.p8e3;

import java.util.ArrayList;

public class Carta {
    private Persona remitente;
    private ArrayList<String> regalos;

    public Carta (Persona remitente, ArrayList<String> regalos) {
        this.remitente = remitente;
        this.regalos = regalos;
    }

    public Persona getPersona () {
        return this.getPersona();
    }

    public ArrayList<String> getRegalos () {
        return (ArrayList) regalos.clone();
    }

    public void eliminarRegalos () {
        this.regalos.clear();
    }
    public void addRegalo (String regalo) {
        this.regalos.add(regalo);
    }
}
