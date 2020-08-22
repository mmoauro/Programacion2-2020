package p2e5;
import java.util.ArrayList;
public class Celular {
    private  ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    public Celular () {

    }
    public void agregarContacto (Contacto contacto) {
        this.contactos.add(contacto);
    }
    public void imprimirContactos () {
        for (Contacto contacto : contactos) {
            System.out.println(contacto.getNombreCompleto());
        }
    }
}