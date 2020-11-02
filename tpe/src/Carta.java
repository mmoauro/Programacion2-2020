import java.util.ArrayList;

public class Carta {
    private String nombrePersonaje;
    private ArrayList<Atributo> atributos;
    private Pocima pocima;

    public Carta (String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
        this.atributos = new ArrayList<>();
    }

    public String getNombrePersonaje () {
        return this.nombrePersonaje;
    }

    public ArrayList<Atributo> getAtributos () {
        return (ArrayList<Atributo>) this.atributos.clone();
    }

    public Atributo getAtributo (int pos) {
        if (pos >= 0 && pos < this.getAtributos().size()) {
            return this.atributos.get(pos);
        }
        return null;
    }

    public int getCantidadAtributos () {
        return this.atributos.size();
    }

    public void addAtributo (Atributo atr) {
        this.atributos.add(atr);
    }

    public void setPocima (Pocima pocima) {
        this.pocima = pocima;
    }

    public void aplicarPocima () {
        if (this.pocima != null) {
            this.pocima.cambairValores(this);
        }
    }

    public boolean tengoPocima () {
        return this.pocima != null;
    }

    public Pocima getPocima () {
        return this.pocima;
    }

    @Override
    public boolean equals (Object o) {
        try {
            Carta otra = (Carta) o;
            // Verifico que la cantidad de atributos de las cartas sean iguales
            if (this.getAtributos().size() != otra.getAtributos().size()) {
                return false;
            }
            else {
                if (this.atributos.containsAll(otra.getAtributos())) {
                    return true;
                }
                else {
                    return false;
            }
            }

        }
        catch (Exception e) {
            return false;
        }
    }
}