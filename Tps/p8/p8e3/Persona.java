package p8.p8e3;

public class Persona {
    private String dni;

    public Persona(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Persona p = (Persona) obj;
            return p.dni == this.dni;
        }
        catch (Exception e) {
            return false;
        }
    }
}
