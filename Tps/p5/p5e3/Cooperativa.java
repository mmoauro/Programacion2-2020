package p5e3;

import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<Cereal> cereales;
    private ArrayList<Lote> lotes;
    private ArrayList<String> mineralesPrimarios;
    private ArrayList<String> mineralesSecundarios;

    public Cooperativa() {
        this.mineralesPrimarios = new ArrayList<>();
        this.mineralesSecundarios = new ArrayList<>();
        this.cereales = new ArrayList<>();
        this.lotes = new ArrayList<>();
    }

    public ArrayList cerealesQueSePuedenSembrarEnLote (Lote lote) {
        ArrayList<Cereal> cerealesPosibles = new ArrayList<>();
        for (Cereal cereal:this.cereales) {
            if (cereal.mePuedenSembrar(lote)) {
                cerealesPosibles.add(cereal);
            }
        }
        return cerealesPosibles;
    }
    public ArrayList loteDondeSePuedeSembrar (Cereal cereal) {
        ArrayList<Lote> lotesPosibles = new ArrayList<>();
        for (Lote lote:this.lotes) {
            if (cereal.mePuedenSembrar(lote)) {
                lotesPosibles.add(lote);
            }
        }
        return lotesPosibles;
    }
    public boolean loteEsEspecial (Lote lote) {
        int i = 0;
        for (String mineral:this.mineralesPrimarios) {
            if (lote.contieneMineral(mineral)) {
                i++;
            }
        }
        return i == this.mineralesPrimarios.size();
    }
    public void setCereal (Cereal cereal) {
        this.cereales.add(cereal);
    }
    public void setLote (Lote lote) {
        this.lotes.add(lote);
    }

}
