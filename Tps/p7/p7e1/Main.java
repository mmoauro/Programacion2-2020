package p7.p7e1;


public class Main {
    public static void main(String[] args) {

        Palabra manu = new Palabra("Manuel", "Nombre propio");
        Palabra hacer = new Palabra("Hacer", "Verbo");
        Palabra nueva = new Palabra("Nueva", "ewf");
        Palabra z = new Palabra("zz", "SAdas");

        Diccionario uno = new Diccionario();
        uno.addPalabra(nueva);
        uno.addPalabra(manu);
        uno.addPalabra(z);
        uno.addPalabra(hacer);

        manu.addAntonimo(hacer);
        System.out.println(uno.getPalabras());
        System.out.println(uno.getPalabrasEntreDos(hacer, hacer));

    }
}
