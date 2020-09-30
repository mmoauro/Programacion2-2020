package p6e5;

public class Barco {
    private double capacidad;

    public Barco (double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return this.capacidad;
    }
    public void cargar () {
        System.out.println("Cargando");
    }
}
