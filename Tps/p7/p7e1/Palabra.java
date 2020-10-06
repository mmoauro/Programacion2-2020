package p7.p7e1;

import java.util.ArrayList;

public class Palabra implements Comparable<Palabra> {
    private String palabra;
    private String funcionGramatical;
    private ArrayList<String> significados;
    private ArrayList<Palabra> sinonimos;
    private ArrayList<Palabra> antonimos;
    private Integer cantidadRepetida; // para ejercicio 2

    public Palabra (String palabra, String funcionGramatical) {
        this.palabra = palabra;
        this.funcionGramatical = funcionGramatical;
        this.antonimos = new ArrayList<>();
        this.sinonimos = new ArrayList<>();
        this.significados = new ArrayList<>();
        this.cantidadRepetida = 1;
    }
    public void addRepetido () {
        this.cantidadRepetida++;
    }
    public Integer getCantidadRepetida () {
        return this.cantidadRepetida;
    }

    public String getPalabra() {
        return this.palabra;
    }

    public ArrayList<String> getSignificados () {
        return new ArrayList<>(this.significados);
    }

    public boolean soySinonimo (Palabra palabra) {
        return this.sinonimos.contains(palabra);
    }

    public boolean soyAntonimo (Palabra pal) {
        return this.antonimos.contains(pal);
    }

    public void addSinonimo (Palabra pal) {
        if (!this.sinonimos.contains(pal)) {
            this.sinonimos.add(pal);
            pal.addSinonimo(this);
        }
    }
    public void addAntonimo (Palabra pal) {
        if (!this.antonimos.contains(pal)) {
            this.antonimos.add(pal);
            pal.addAntonimo(this);
        }
    }

    @Override
    public int compareTo(Palabra palabra) {
        // Esta hecho para el ejercicio 1 y el 2.
        return this.palabra.compareTo(palabra.getPalabra()); // ejer 1
        //return this.getCantidadRepetida().compareTo(palabra.getCantidadRepetida()); // ejer 2
    }

    @Override
    public String toString () {
        return this.palabra;
    }

    @Override
    public boolean equals (Object o) {
        try {
            Palabra nueva = (Palabra) o;
            return this.getPalabra().equals(nueva.getPalabra());

        }
        catch (Exception e) {
            return false;
        }
    }


}
