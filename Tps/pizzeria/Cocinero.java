package pizzeria;
public class Cocinero {
    private String nombre;
    private int pizzasCocinadas;
    private int sueldo;

    public Cocinero (String nombre) {
        this.nombre = nombre;
        this.sueldo = 0;
        this.pizzasCocinadas = 0;
    }
    public String getNombre () {
        return this.nombre;
    }
    public int getPizzasCocinadas () {
        return this.pizzasCocinadas;
    }
    public void setPizzaCocinada () {
        this.pizzasCocinadas++;
    }
    public void setSueldo (int sueldoBase) {
        this.sueldo = sueldoBase * pizzasCocinadas;
    }
    public int getSueldo () {
        return this.sueldo;
    }
}