package p7.p7e4;

import java.util.ArrayList;

public class Planta implements Comparable<Planta> {
    private ArrayList<Caratcteristica> caracteristicas;
    private static String comparador; // nombre caracteristica

    public Planta () {
        this.caracteristicas = new ArrayList<>();
        Planta.comparador = "Nombre";
    }

    public void addCaracteristica (String nombre, Comparable valor) {
        Caratcteristica c = new Caratcteristica(nombre, valor);
        if (!this.caracteristicas.contains(c))
            this.caracteristicas.add(c);
    }

    public Caratcteristica getCaracteristica (String nombre) {
        for (Caratcteristica caracteristica:this.caracteristicas) {
            if (caracteristica.getNombre().equals(nombre))
                return caracteristica;
        }
        return null;
    }

    public static void setComparador (String caractertistica) {
        Planta.comparador = caractertistica;
    }

    public String getComparador () {
        return Planta.comparador;
    }

    public String toString () {
        return (String) this.getCaracteristica("Nombre").getValor();
    }

    @Override
    public int compareTo(Planta o) {
        return this.getCaracteristica(Planta.comparador).compareTo(o.getCaracteristica(Planta.comparador));
    }
}
