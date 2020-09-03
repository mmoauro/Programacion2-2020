package p4e5;

import java.time.LocalDate;

public class Producto {
    private LocalDate fechaVencimiento;
    private int numeroLote;
    private LocalDate fechaEnvasado;
    private String granjaOrigen;

    public Producto (LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen) {
        this.fechaVencimiento = fechaVencimiento;
        this.fechaEnvasado = fechaEnvasado;
        this.numeroLote = numeroLote;
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }
    public  String toString() {
        return "Fecha de vencimiento: " + this.fechaVencimiento + ", fecha de envasado: " + this.fechaEnvasado + ", numero de lote: " + this.numeroLote + ", granja de origen: " + this.granjaOrigen;
    }
}
