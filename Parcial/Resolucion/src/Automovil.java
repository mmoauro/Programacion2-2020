import java.util.ArrayList;

public class Automovil {
    private ArrayList<Caracteristica> caracteristicas;

    public Automovil (String marca, int modelo) {
        // Entiendo que la marca y el modelo son dos caracteristicas mas, y no es necesaria considerarlas como atrubutos separados, pero
        // los pido obligatoriamente y los agrego a las caracteristicas.
        this.caracteristicas = new ArrayList<>();
        this.caracteristicas.add(new Caracteristica("Marca", marca));
        this.caracteristicas.add(new Caracteristica("Modelo", modelo));
    }

    public void addCaracteristica (String nombre, Comparable valor) {
        Caracteristica c = new Caracteristica(nombre, valor);
        if (!this.caracteristicas.contains(c))
            this.caracteristicas.add(c);
    }

    public boolean caracteristicaEsMayor (Caracteristica c) {
        if (this.contieneCaracteristica(c)) {
            for (Caracteristica caracteristica:this.caracteristicas) {
                if (caracteristica.equals(c))
                    return caracteristica.compareTo(c) > 0;
            }
        }
        return false;
    }

    public boolean caracteristicaEsIgual (Caracteristica c) {
        if (this.contieneCaracteristica(c)) {
            for (Caracteristica caracteristica:this.caracteristicas) {
                if (caracteristica.equals(c))
                    return caracteristica.compareTo(c) == 0;
            }
        }
        return false;
    }

    public boolean contieneCaracteristica (Caracteristica c) {
        return this.caracteristicas.contains(c);
    }

    public Automovil getCopia () {
        Comparable marca = "";
        Comparable modelo = 0;
        for (Caracteristica c:this.caracteristicas) {
            if (c.getNombre().equals("Marca")) {
                marca = c.getValor();
            }
            else if (c.getNombre().equals("Modelo")) {
                modelo = c.getValor();
            }
        }
        return new Automovil((String)marca, (int)modelo);
    }


}
