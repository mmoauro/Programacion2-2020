package p6e5;

import java.time.LocalDate;

public class Camion {
    private LocalDate fechaCargado;

    public Camion (LocalDate fecha) {
        this.fechaCargado = fecha;
    }
    public LocalDate getFechaCargado () {
        return this.fechaCargado;
    }
    public void descargar () {
        System.out.println("Descargando");
    }
}
