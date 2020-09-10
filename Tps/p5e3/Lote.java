package p5e3;

import java.util.ArrayList;

public class Lote {
    private int hectareas;
    private ArrayList<String> minerales;

    public Lote (int hectareas) {
        this.hectareas = hectareas;
        this.minerales = new ArrayList<>();
    }
    public void setMineral (String mineral) {
        this.minerales.add(mineral);
    }
    public ArrayList getMinerales () {
        return this.minerales;
    }
    public int getHectareas () {
        return this.hectareas;
    }
    public boolean contieneMineral (String mineral) {
        return this.minerales.contains(mineral);
    }
}
