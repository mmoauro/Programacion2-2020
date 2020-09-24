public class Carta {
    private Personaje personaje;

    public Carta (Personaje personaje) {
        this.personaje = personaje;
    }

    public Personaje getPersonaje() {
        return this.personaje;
    }
    public boolean equals (Object o) {
        try {
            Carta nueva = (Carta) o;
            for (int i = 0; i < this.getPersonaje().getAtributos().size(); i++) {
                if (!this.getPersonaje().getAtributos().get(i).getNombre().equals
                        (nueva.getPersonaje().getAtributos().get(i).getNombre())) {
                    return false;
                }
            }
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
