package p3e4;
public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean yaSeVio;
    private int calificacion;

    public Episodio (String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.yaSeVio = false;
        this.calificacion = -1;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public void setYaSeVio () {
        this.yaSeVio = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean yaSeVio() {
        return yaSeVio;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
