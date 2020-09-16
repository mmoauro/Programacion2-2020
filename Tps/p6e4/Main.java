package p6e4;

public class Main {
    public static void main(String[] args) {
        Centro manuel = new Centro();
        Computadora pc = new Computadora(000);
        Proceso tarea = new Proceso(200);
        manuel.addComputadora(pc);
        manuel.ejecutarTarea(tarea);
        manuel.ejecutarTarea(tarea);
        manuel.ejecutarTarea(tarea);
        manuel.ejecutarTarea(tarea);

    }
}
