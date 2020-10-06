package p6e5;

import java.util.ArrayList;

public class Puerto {
    private ArrayList<Barco> colaBarcos;
    private ArrayList<Camion> colaCamiones;
    private boolean cargaEnProceso;

    public Puerto () {
        this.colaBarcos = new ArrayList<>();
        this.colaCamiones = new ArrayList<>();
        this.cargaEnProceso = false;
    }

    public void cargarBarco () {
        if (this.colaBarcos.size() > 0 && this.colaCamiones.size() > 0) {
            this.cargaEnProceso = true;
            this.colaCamiones.get(0).descargar();
            this.colaBarcos.get(0).cargar();
            this.colaBarcos.remove(0);
            this.colaCamiones.remove(0);
            this.cargaEnProceso = false;
        }
    }
    public void addCamionACola (Camion camion) {
        this.colaCamiones.add(camion);
    }
    public void addBarcoACola (Barco barco) {
        this.colaBarcos.add(barco);
    }
}
