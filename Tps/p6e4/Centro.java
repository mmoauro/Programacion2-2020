package p6e4;

import java.util.ArrayList;

public class Centro {
    private ArrayList<Computadora> computadoras;
    private ArrayList<Proceso> colaDeEspera;
    private ArrayList<Computadora> colaDeComputadoras;

    public Centro() {
        this.computadoras = new ArrayList<>();
        this.colaDeEspera = new ArrayList<>();
    }

    public void ejecutarTarea (Proceso proceso) {
        ArrayList<Computadora> computadorasDisponibles =  this.getColaDeComputadoras();
        if (computadorasDisponibles.size() == 0) {
            this.colaDeEspera.add(proceso);
            // ordenar.
        }
        else {
            Computadora compu = this.getComputadoraParaTarea(computadorasDisponibles, proceso);
            if (compu != null) {
                compu.setEstaDisponible(false);
                // ejecuta la tarea
                proceso.ejecutar();
                //compu.setEstaDisponible(true);
            }
        }
    }

    public ArrayList<Computadora> getColaDeComputadoras () {
        this.colaDeComputadoras = new ArrayList<>();
        for (Computadora computadora:this.computadoras) {
            if (computadora.getEstaDisponible()) {
                this.colaDeComputadoras.add(computadora);
            }
        }
        return this.colaDeComputadoras;
    }

    public void addComputadora (Computadora computadora) {
        this.computadoras.add(computadora);
    }

    public Computadora getComputadoraParaTarea (ArrayList<Computadora> computadorasDisponibles, Proceso proceso) {
        int i = 0;
        while (i < computadorasDisponibles.size()) {
            if (computadorasDisponibles.get(i).getVelocidad() >= proceso.getMemoriaRequerida()) {
                return computadorasDisponibles.get(i);
            }
            i++;
        }
        return null;
    }

}
