package p2e5;
public class Main {
    public static void main(String[] args) {
        Celular iphone = new Celular();
        Contacto pelu = new Contacto("Lucas", 30, "1/2/1994", "123456", "Junin 1234", "pelu@gmail.com", "Buenos Aires");
        iphone.agregarContacto(pelu);
        iphone.imprimirContactos();
    }
}