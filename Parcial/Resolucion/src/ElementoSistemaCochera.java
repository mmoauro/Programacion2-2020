import java.util.ArrayList;

public interface ElementoSistemaCochera {
    int getCantiadCocheras();
    ArrayList<Cochera> getCocherasDisponiblesParaAutomovil(Automovil automovil);
    ElementoSistemaCochera getCopia (Criterio c);
}
