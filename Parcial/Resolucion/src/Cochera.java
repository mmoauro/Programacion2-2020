import java.util.ArrayList;

public class Cochera implements ElementoSistemaCochera {
    private ArrayList<Caracteristica> caracteristicas;
    private Automovil auto;
    private Criterio criterioAlquiler;

    public Cochera (Criterio criterioAlquiler) {
        this.caracteristicas = new ArrayList<>();
        this.auto = null;
        // Dejo el auto en null porque cuando se inicia una Cochera no tiene ningun auto.
        this.criterioAlquiler = criterioAlquiler;
    }

    public void setCriterio (Criterio c) {
        this.criterioAlquiler = c;
    }

    public void alquilar (Automovil auto) {
        if (this.auto == null && this.autoCumple(auto))
            this.setAuto(auto);
    }

    private void setAuto (Automovil auto) {
        this.auto = auto;
    }

    public void descocupar () {
        this.auto = null;
    }

    public boolean autoCumple (Automovil automovil) {
        return this.criterioAlquiler.cumple(automovil);
    }

    public void addCaracteristica (String nombre, Comparable valor) {
        Caracteristica c = new Caracteristica(nombre, valor);
        if (!this.caracteristicas.contains(c))
            this.caracteristicas.add(c);
    }

    @Override
    public int getCantiadCocheras() {
        return 1;
    }

    @Override
    public ArrayList<Cochera> getCocherasDisponiblesParaAutomovil(Automovil automovil) {
        ArrayList<Cochera> retorno = new ArrayList<>();
        if (this.auto == null && this.autoCumple(automovil))
            retorno.add(this);
        return retorno;
    }

    @Override
    public ElementoSistemaCochera getCopia(Criterio c) {
        // Entiendo que la copia se devuelve si la cochera tiene un auto, y si el auto cumple con el Criterio.
        if (this.auto != null) {
            if (c.cumple(this.auto)) {
                Cochera retorno = new Cochera(this.criterioAlquiler);
                for (Caracteristica caracteristica:this.caracteristicas) {
                    retorno.addCaracteristica(caracteristica.getNombre(), caracteristica.getValor());
                }
                retorno.setAuto(this.auto.getCopia());
                return retorno;
            }
        }
        return null;
    }
}
