package p1e4;

public class Jugador {
    String nombre;
    int cantidadAlquileres;

    public Jugador (String nombre) {
        this.nombre = nombre;
        this.cantidadAlquileres = 0;
    }
    
    public void addAlquiler () {
        this.cantidadAlquileres++;
    }

    public boolean esSocio () {
        return cantidadAlquileres >= 4;
    }
    
    
}