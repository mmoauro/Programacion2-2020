package p8.p8e6;

import java.time.Period;
import java.util.ArrayList;

public interface TareaAbs {
    ArrayList<TareaAbs> getTareasAtrasadas ();
    ArrayList<TareaAbs> getTareasUsanRecurso (Recurso recurso);
    ArrayList<Recurso> getRecursos ();
    Period getFechaDuracionEstimada ();
}
