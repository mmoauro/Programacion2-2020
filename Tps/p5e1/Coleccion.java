package p5e1;

import java.util.ArrayList;

public class Coleccion {
    ArrayList<Elemento> pilaElementos;

    public Coleccion () {

    }
    public void push (Elemento elem) {
        this.pilaElementos.add(elem);
    }

    public Elemento pop () {
        Elemento ultimo = this.pilaElementos.get(this.pilaElementos.size() - 1);
        this.pilaElementos.remove(this.pilaElementos.size() - 1);
        return ultimo;
    }
    public Elemento top () {
        return this.pilaElementos.get(this.pilaElementos.size() - 1);
    }
    public int size () {
        return this.pilaElementos.size();
    }
    public ArrayList copy () {
        ArrayList<Elemento> copia = new ArrayList<>();
        for (Elemento elem : this.pilaElementos) {
            copia.add(elem);
        }
        return copia;
    }
    public ArrayList reverse () {
        ArrayList<Elemento> copia = new ArrayList<>();
        for (int i = this.pilaElementos.size() - 1; i >= 0; i--) {
            copia.add(this.pilaElementos.get(i));
        }
        return copia;
    }
}
