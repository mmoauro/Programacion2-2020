package p2e4;
public class Personaje {
    private String tipo;
    private String nombreReal;
    private String nombreFicticio;
    private int vision;
    private int velocidad;
    private int fuerza;
    private int peso;
    private int altura; // en cm
    private int edad;

    public Personaje (String tipo, String nombreReal, String nombreFicticio, int vision, int velocidad, int fuerza, int peso, int altura, int edad) {
        this.tipo = tipo;
        this.nombreReal = nombreReal;
        this.nombreFicticio = nombreFicticio;
        this.vision = vision;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getNombreFicticio() {
        return nombreFicticio;
    }

    public int getVision() {
        return vision;
    }

    public int getVelocidad() {
        return velocidad;
    }


    public int getFuerza() {
        return fuerza;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }
}