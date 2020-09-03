package p4e1;

public class Luz {
    private String color;

    public Luz (String color) {
        this.color = color;
    }
    public String encender () {
        System.out.println(this.color);
        return this.color;
    }
}
