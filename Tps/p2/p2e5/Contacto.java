package p2e5;
public class Contacto {
    private String nombreCompleto; //Nombre y apellido
    private int edad;
    private String fechaNacimiento;
    private String numeroTelefono;
    private String direccion;
    private String mail;
    private String ciudad;

    public Contacto (String nombreCompleto, int edad, String fechaNacimiento, String telefono, String direccion, String mail, String ciudad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = telefono;
        this.direccion = direccion;
        this.mail = mail;
        this.ciudad = ciudad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}