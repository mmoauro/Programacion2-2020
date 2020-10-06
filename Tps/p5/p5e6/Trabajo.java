package p5e6;

import java.util.ArrayList;

public class Trabajo {
    // Considero Trabajo como un articulo o resumen.
    private ArrayList<String> palabrasClaves;

    public Trabajo () {
        this.palabrasClaves = new ArrayList<>();
    }
    public void agregarPalabraClave (String palabraClave) {
        this.palabrasClaves.add(palabraClave);
    }
    public ArrayList getPalabrasClaves () {
        return this.palabrasClaves;
    }
    public boolean seLePuedeAsignarEvaluador (Evaluador evaluador) {
        int i = 0;
        for (String palabra:this.palabrasClaves) {
            if (evaluador.getConocimientos().contains(palabra)) {
                i++;
            }
        }
        return i == this.palabrasClaves.size();
    }
}
