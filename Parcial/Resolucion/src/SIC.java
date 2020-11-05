import java.util.ArrayList;

public class SIC {
    private ArrayList<Estacionamiento> estacionamientos;

    public SIC () {
        this.estacionamientos = new ArrayList<>();
    }

    public void addEstacionamiento (Estacionamiento e) {
        if (!this.estacionamientos.contains(e))
            this.estacionamientos.add(e);
    }

    public int getCantidadCocheras () {
        int total = 0;
        for (Estacionamiento e:this.estacionamientos) {
            total += e.getCantiadCocheras();
        }
        return total;
    }

    public SIC getCopia (Criterio c) {
        ArrayList<Estacionamiento> eCumplen = new ArrayList<>(); // Estacionamientos que cumplen
        for (Estacionamiento e:this.estacionamientos) {
            if (e.getCopia(c) != null)
                eCumplen.add(e);
        }
        if (eCumplen.size() > 0) {
            SIC copia = new SIC();
            for (Estacionamiento estacionamiento:eCumplen) {
                copia.addEstacionamiento(estacionamiento);
            }
            return copia;
        }
        return null;
    }

}
