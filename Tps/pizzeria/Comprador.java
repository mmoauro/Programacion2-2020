package pizzeria;
public class Comprador {
    private String nombre;
    private int distanciaPizzeria;
    private boolean estudiaEnExactas;

    public Comprador (String nombre, int distanciaPizzeria) {
        this.nombre = nombre;
        this.distanciaPizzeria = distanciaPizzeria;
        estudiaEnExactas = false;
    }

    public String getNombre () {
        return this.nombre;
    }
    public int getDistancia () {
        return this.distanciaPizzeria;
    }
    public void setEstudiaExactas () {
        this.estudiaEnExactas = true;
    }
    public boolean estudiaEnExactas () {
        return this.estudiaEnExactas;
    }
    public void mudanza (int nuevaDistanciaPizzeria) {
        this.distanciaPizzeria = nuevaDistanciaPizzeria;
    }

}