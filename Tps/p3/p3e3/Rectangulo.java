package p3e3;
public class Rectangulo {
    private PuntoGeometrico vertice1;
    private PuntoGeometrico vertice2;
    private double area;

    public Rectangulo (PuntoGeometrico vertice1, PuntoGeometrico vertice2) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        setArea();
    }
    public double getAltura () {
        double altura;
        if (this.vertice1.getCoordY() >= this.vertice2.getCoordY()) {
            altura = this.vertice1.getCoordY() - this.vertice2.getCoordY();
        }
        else {
            altura = this.vertice2.getCoordY() - this.vertice1.getCoordY();
        }
        return altura;
    }

    public double getAnchura () {
        double anchura;
        if (this.vertice1.getCoordX() >= this.vertice2.getCoordX()) {
            anchura = this.vertice1.getCoordX() - this.vertice2.getCoordX();
        }
        else {
            anchura = this.vertice2.getCoordX() - this.vertice1.getCoordX();
        }
        return anchura;
    }

    public void setArea () {
        double anchura = this.getAnchura();
        double altura = this.getAltura();

        this.area = anchura * altura;
    }

    public double getArea () {
        return this.area;
    }

    public int esMayorQueOtro (Rectangulo rectangulo) {
        return Double.compare(this.getArea(), rectangulo.getArea());
    }

    public boolean esCuadrado () {
        return this.getAltura() == this.getAnchura();
    }

    public boolean estaAcostado () {
        return this.getAnchura() > this.getAltura();
    }

}
