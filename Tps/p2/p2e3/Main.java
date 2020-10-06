package p2e3;
public class Main {
    public static void main(String[] args) {
        Fabrica moauro = new Fabrica();
        Manufactura silla = new Manufactura("Silla", 2, 500, "Roble", "Marron");
        Manufactura mueble = new Manufactura("Mueble", 50, 2500, "Roble", "Marron");
        Manufactura [] productos = {silla, mueble};
        for (Manufactura manufactura : productos) {
            moauro.setProducto(manufactura);
        }
        System.out.println(moauro.precioTotalProductosEnStock());
    }
}