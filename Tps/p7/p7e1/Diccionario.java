package p7.p7e1;

import java.util.ArrayList;
import java.util.Collections;

public class Diccionario {
    private ArrayList<Palabra> palabras;

    public Diccionario () {
        this.palabras = new ArrayList<>();
    }
    public void addPalabra (Palabra palabra) {
        if (!this.palabras.contains(palabra))
            this.palabras.add(palabra);

        Collections.sort(this.palabras);
    }
    public void eliminarPalabra (Palabra pal) {
        if (this.palabras.contains(pal))
            this.palabras.remove(pal);
    }
    public ArrayList<Palabra> getSinonimos (Palabra pal) {
        ArrayList<Palabra> retorno = new ArrayList<>();
        for (Palabra palabra:this.palabras) {
            if (palabra.soySinonimo(pal))
                retorno.add(palabra);
        }
        return retorno;
    }
    public ArrayList<Palabra> getAntonimos (Palabra pal) {
        ArrayList<Palabra> retorno = new ArrayList<>();
        for (Palabra palabra:this.palabras) {
            if (palabra.soyAntonimo(pal))
                retorno.add(palabra);
        }
        return retorno;
    }
    public ArrayList<String> getDefiniciones (Palabra pal) {
        return (ArrayList) pal.getSignificados();
    }
    public ArrayList<Palabra> getPalabrasEntreDos (Palabra pal1, Palabra pal2) {
        ArrayList<Palabra> retorno = new ArrayList<>();
        Palabra menor = pal1;
        Palabra mayor = pal2;
        if (pal1.compareTo(pal2) > 0) {
            menor = pal2;
            mayor = pal1;
        }
        int inicio = 0;
        while (!this.palabras.get(inicio).equals(menor)) {
            inicio++;
        }
        inicio++;
        while (inicio < this.palabras.size() && !this.palabras.get(inicio).equals(mayor)) {
            retorno.add(this.palabras.get(inicio));
            inicio++;
        }
        return retorno;
    }
    public ArrayList<Palabra> getPalabras () {
        return (ArrayList) this.palabras.clone();
    }

}
