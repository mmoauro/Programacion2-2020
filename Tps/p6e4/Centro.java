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
        if (this.getColaDeComputadoras().size() == 0) {
            this.colaDeEspera.add(proceso);
        }
        else {
            Computadora compu = this.getComputadoraParaTarea(proceso);
            if (compu != null) {
                compu.setEstaDisponible(false);
                this.colaDeComputadoras.remove(compu);
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

    public Computadora getComputadoraParaTarea (Proceso proceso) {
        int i = 0;
        while (i < this.getColaDeComputadoras().size()) {
            if (this.getColaDeComputadoras().get(i).getVelocidad() >= proceso.getMemoriaRequerida()) {
                return this.getColaDeComputadoras().get(i);
            }
            i++;
        }
        return null;
    }

}
