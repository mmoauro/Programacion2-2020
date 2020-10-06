package p4e3;

public class Main {
    public static void main(String[] args) {
        Empleado manu = new EmpleadoPorHoras("Manuel", 10000, 10);
        System.out.println(manu.getSueldo());
    }
}
