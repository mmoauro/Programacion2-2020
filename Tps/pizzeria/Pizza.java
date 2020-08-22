package pizzeria;
public class Pizza {
    private String sabor;
    private int precio;

    public Pizza (String sabor, int precio) {
        this.sabor = sabor;
        this.precio = precio;
    }
    public String getSabor () {
        return this.sabor;
    }
    public int getPrecio () {
        return this.precio;
    }
    public void setPrecio (int precio) {
        this.precio = precio;
    }
}