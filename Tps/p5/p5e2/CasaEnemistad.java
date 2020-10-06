package p5e2;

import java.util.ArrayList;

public class CasaEnemistad extends Casa {
    private ArrayList<Casa> casasEnemigas;

    public CasaEnemistad (int cantiadAlumnosMaxima, int codigo) {
        super(cantiadAlumnosMaxima, codigo);
        this.casasEnemigas = new ArrayList<>();
    }
    public void addCasaEnemiga (Casa casa) {
        this.casasEnemigas.add(casa);
    }

    @Override
    public boolean alumnoPuedeIngresar(Alumno alumno) {
        if (this.casasEnemigas.contains(alumno.getCasaPerteneciente())) {
            return false;
        }
        return super.alumnoPuedeIngresar(alumno) && true;
    }
}
