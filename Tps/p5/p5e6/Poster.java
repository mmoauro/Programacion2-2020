package p5e6;

public class Poster extends Trabajo {

    public Poster () {
        super();
    }

    public boolean seLePuedeAsignarEvaluador(Evaluador evaluador) {
        int i = 0;
        for (int j = 0; j < this.getPalabrasClaves().size(); j++) {
            if (evaluador.getConocimientos().contains(this.getPalabrasClaves().get(j))) {
                i++;
            }
        }
        return i > 0;
    }
}
