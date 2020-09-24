import java.util.ArrayList;

public class Personaje {
    private String nombre;
    private ArrayList<Atributo> atributos;

    public Personaje (String nombre, ArrayList<Atributo> atributos) {
        this.nombre = nombre;
        this.atributos = atributos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Atributo> getAtributos() {
        return this.atributos;
    }
}
