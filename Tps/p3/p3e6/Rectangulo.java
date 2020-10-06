package p3e6;
public class Rectangulo {
    private p3e3.PuntoGeometrico vertice;
    private double altura;
    private double anchura;

    public Rectangulo (p3e3.PuntoGeometrico vertice, double altura, double anchura) {
        this.vertice = vertice;
        this.altura = altura;
        this.anchura = anchura;
    }
    public double getAltura () {
        return this.altura;
    }
    public double getAnchura () {
        return this.anchura;
    }
    public boolean esCuadrado () {
        return this.altura == this.anchura;
    }
    public boolean estaAcostado () {
        return  this.anchura > this.altura;
    }
    public double getArea () {
        return this.altura * this.anchura;
    }
    public boolean esMayorQueOtro (Rectangulo rectangulo) {
        return this.getArea() > rectangulo.getArea();
    }
    public p3e3.PuntoGeometrico getVertice2 () {
        double coordX2 = this.vertice.getCoordX() + anchura;
        double cordY2 = this.vertice.getCoordY() + altura;
        return new p3e3.PuntoGeometrico(coordX2, cordY2);
    }
}
