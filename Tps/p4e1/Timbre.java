package p4e1;

public class Timbre {
    private String sonido = "TRING TRING";

    public Timbre () {

    }
    public String sonar () {
        System.out.println(this.sonido);
        return this.sonido;
    }
}
