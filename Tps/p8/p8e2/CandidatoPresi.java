package p8.p8e2;

public class CandidatoPresi extends Persona{
    private String nombre;
    private String agrupacion;
    private String partido;
    private int votos;

    public CandidatoPresi(String dni, String nombre, String agrupacion, String partido) {
        super(dni);
        this.nombre = nombre;
        this.agrupacion = agrupacion;
        this.partido = partido;
        this.votos = 0;
    }

    public void addVoto () {
        this.votos ++;
    }

    public int getVotos () {
        return this.votos;
    }
}
