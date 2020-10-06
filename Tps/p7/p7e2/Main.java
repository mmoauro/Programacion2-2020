package p7.p7e2;


public class Main {
    public static void main(String[] args) {
        Vocabulario a = new Vocabulario("Manuel Manuel hola hola hola as");
        System.out.println(a.getCantidadPalabrasDistintas());
        System.out.println(a.getPalabrasFrecuentes(2,1));
        System.out.println(a.getFrecuenciaPalabra("Manuel"));
        System.out.println(a.getTodasPalabras(-1));
    }
}
