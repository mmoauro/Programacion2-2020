package p7.p7e4;

public class Main {
    public static void main(String[] args) {
        Planta a = new Planta();
        Planta b = new Planta();
        a.addCaracteristica("Riego", 8);
        b.addCaracteristica("Riego", 5);

        a.addCaracteristica("Nombre", "zzzz");
        b.addCaracteristica("Nombre", "aasdasd");

        Vivero viv = new Vivero();
        viv.addPlanta(a);
        viv.addPlanta(b);
        System.out.println(viv.getPlantas(new CriterioMayor("Riego", 1), "Riego", 1));
    }
}
