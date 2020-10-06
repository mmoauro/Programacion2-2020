package p3e2;
public class Main {
    public static void main(String[] args) {
        Electrodomestico heladera = new Electrodomestico("Heladera", 10000, "Blanco", 45, 20);
        System.out.println(heladera.esGamaAlta());
    }

}
