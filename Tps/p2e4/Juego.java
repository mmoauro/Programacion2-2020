package p2e4;
public class Juego {
    private Personaje pj1;
    private Personaje pj2;

    public Juego () {
        int [] atributosPj1 = new int [6];
        int [] atributosPj2 = new int [6];
        for (int i = 0; i < 6; i++) {
            int attr1 = (int)  (Math.random()*100)+1;
            int attr2 = (int)  (Math.random()*100)+1;
            atributosPj1[i] = attr1;
            atributosPj2[i] = attr2;
        }
        pj1 = new Personaje("Heroe", "Manuel", "Manu", atributosPj1[0], atributosPj1[1], atributosPj1[2], atributosPj1[3], atributosPj1[4], atributosPj1[5]);
        pj2 = new Personaje("Villano", "Lucas", "Pelu", atributosPj2[0], atributosPj2[1], atributosPj2[2], atributosPj2[3], atributosPj2[4], atributosPj2[5]);
    }
    public void jugar(int atributo) {
        if (pj1.getTipo() != pj2.getTipo()) {
            // vision, velocidad, fuerza, peso, altura edad.
            switch (atributo) {
                case 0:
                    imprirGanador(pj1.getVision() > pj2.getVision());
                    break;
                case 1:
                    imprirGanador(pj1.getVelocidad() > pj2.getVelocidad());
                    break;
                case 2:
                    imprirGanador(pj1.getFuerza() > pj2.getFuerza());
                    break;
                case 3:
                    imprirGanador(pj1.getPeso() > pj2.getPeso());
                    break;
                case 4:
                    imprirGanador(pj1.getAltura() > pj2.getAltura());
                    break;
                case 5:
                    imprirGanador(pj1.getEdad() > pj2.getEdad());
                    break;
            }
        }
    }
    public void imprirGanador (boolean ganador) {
        if (ganador) {
            System.out.println("Gano " + pj1.getNombreFicticio());
        }
        else {
            System.out.println("Gano " + pj2.getNombreFicticio());
        }

    }
}