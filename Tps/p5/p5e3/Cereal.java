package p5e3;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> minerales;

    public Cereal (String nombre) {
        this.nombre = nombre;
        this.minerales = new ArrayList<>();
    }
    public void setMineral(String mineral) {
        this.minerales.add(mineral);
    }
    public ArrayList getMinerales () {
        return this.minerales;
    }
    public boolean mePuedenSembrar (Lote lote) {
        for (int i = 0; i < this.minerales.size(); i++) {
            if (!lote.contieneMineral(this.minerales.get(i))) {
                return false;
            }
        }
        return true;
    }
}