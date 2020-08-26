package p3e3;

public class Main {
    public static void main(String[] args) {
        PuntoGeometrico primero = new PuntoGeometrico(2, 4);
        PuntoGeometrico segundo = new PuntoGeometrico(3, 6);
        Rectangulo uno = new Rectangulo(primero, segundo);
        Rectangulo dos = new Rectangulo(primero, segundo);
    }
}
