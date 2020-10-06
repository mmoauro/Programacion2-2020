package p3e3;
public class PuntoGeometrico {
    private double coordX;
    private double coordY;

    public PuntoGeometrico () {
        this.coordX = 0;
        this.coordY = 0;
    }
    public PuntoGeometrico(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
    public void desplazarPunto (double desplazamientoX, double desplazamientoY) {
        this.coordX += (desplazamientoX);
        this.coordY += (desplazamientoY);
    }
    public double calcularDistanciaEuclidea (PuntoGeometrico punto) {
        // Distancia2 = ( X1 – X2 )2+ (Y1 – Y2)2
        double distanciaCuadrado =  Math.pow((this.coordX - punto.getCoordX()), 2) + Math.pow((this.coordY - punto.getCoordY()), 2);
        return Math.sqrt(distanciaCuadrado);
    }
    public double getCoordX () {
        return this.coordX;
    }
    public double getCoordY() {
        return this.coordY;
    }
}
