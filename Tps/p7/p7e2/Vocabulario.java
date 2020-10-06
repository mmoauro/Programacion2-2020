package p7.p7e2;

import java.util.ArrayList;
import java.util.Collections;

import p7.p7e1.Palabra;

public class Vocabulario {
    private String texto;
    private ArrayList<Palabra> palabrasContenidas;

    public Vocabulario (String texto) {
        this.texto = texto;
        this.palabrasContenidas = new ArrayList<>();
        this.addPalabras();
    }

    private void addPalabras () {
        String [] arr = this.texto.split(" ");
        for (String str: arr) {
            Palabra pal = new Palabra(str, "");
            if (this.palabrasContenidas.contains(pal)) {
                for (Palabra pal1:this.palabrasContenidas) {
                    if (pal1.equals(pal))
                        pal1.addRepetido();
                }
            }
            else
                this.palabrasContenidas.add(pal);
        }
    }

    public int getCantidadPalabrasDistintas () {
        return this.palabrasContenidas.size();
    }

    public ArrayList<Palabra> getPalabrasFrecuentes (int cuantas, int orden) {
        // orden < 0 devuelve ascendente, orden > 0 devuelvo descendente
        ArrayList<Palabra> retorno = new ArrayList<>();
        if (orden > 0)
            Collections.sort(this.palabrasContenidas, Collections.reverseOrder());
        else
            Collections.sort(this.palabrasContenidas);

        for (int i = 0; i < cuantas; i++) {
            retorno.add(this.palabrasContenidas.get(i));
        }
        return retorno;
    }

    public int getFrecuenciaPalabra (String pal) {
        for (Palabra pal1:this.palabrasContenidas) {
            if (pal1.getPalabra().equals(pal) && pal1.getCantidadRepetida() > 0)
                return pal1.getCantidadRepetida();
        }
        return 1;
    }

    public ArrayList<Palabra> getTodasPalabras (int orden) {
        // orden < 0 devuelve ascendente, orden > 0 devuelvo descendente
        if (orden > 0)
            Collections.sort(this.palabrasContenidas, Collections.reverseOrder());
        else
            Collections.sort(this.palabrasContenidas);

        return (ArrayList) this.palabrasContenidas.clone();
    }

}
